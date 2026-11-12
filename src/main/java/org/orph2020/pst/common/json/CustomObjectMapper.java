package org.orph2020.pst.common.json;
/*
 * Created on 15/11/2022 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
// IMPL see https://stackoverflow.com/questions/55513502/how-to-create-a-jandex-index-in-quarkus-for-classes-in-a-external-module/55513723#55513723 for how to ensure CDI works for this lib
// IMPL https://lankydan.dev/providing-your-own-jackson-objectmapper-in-quarkus
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import io.quarkus.jackson.ObjectMapperCustomizer;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;
import org.ivoa.dm.proposal.management.ProposalManagementModel;

import jakarta.enterprise.inject.Instance;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Singleton;
import org.ivoa.vodml.json.VodmlHandlerInstantiator;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

/**
 * A custom objectMapper for proposalDM.
 * see https://quarkus.io/guides/rest-json#json
 */
@ApplicationScoped
public class CustomObjectMapper {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory
          .getLogger(CustomObjectMapper.class);

    // Replaces the CDI producer for ObjectMapper built into Quarkus
    @Singleton
    @Produces
    ObjectMapper objectMapper(Instance<ObjectMapperCustomizer> customizers) {

        final TimeZone utc = TimeZone.getTimeZone("UTC");
        final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"); //FIXME Jackson seems to ignore the date format to get desired Z
        df.setTimeZone(utc);

        PolymorphicTypeValidator sv = BasicPolymorphicTypeValidator.builder().allowIfBaseType("org.ivoa.dm").build();
        ObjectMapper.DefaultTyping app;
        var builder = JsonMapper.builder()
             .visibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY)
             .visibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE)
             .defaultTimeZone(utc)
             .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
             .configure(SerializationFeature.WRITE_DATES_WITH_ZONE_ID, false)
             .configure(SerializationFeature.WRAP_ROOT_VALUE, false)
             .configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED, false)
             .handlerInstantiator(new VodmlHandlerInstantiator(ProposalManagementModel.modelDescription));

       List<Module> modules = MapperBuilder.findModules().stream()
             .filter(m -> !m.getModuleName().contains("Xml"))
             .toList();
       builder.addModules(modules);

       ObjectMapper mapper = builder.build()
             .setDefaultPropertyInclusion(JsonInclude.Include.NON_NULL)
             .setDateFormat(new StdDateFormat().withColonInTimeZone(true));



        logger.info("custom jackson mapper used");

        // Apply all ObjectMapperCustomizer beans (incl. Quarkus)
        for (ObjectMapperCustomizer customizer : customizers) {
            customizer.customize(mapper);
        }

        return mapper;
    }
}

