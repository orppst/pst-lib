package org.orph2020.pst.common.json;
/*
 * Created on 15/11/2022 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */
// IMPL see https://stackoverflow.com/questions/55513502/how-to-create-a-jandex-index-in-quarkus-for-classes-in-a-external-module/55513723#55513723 for how to ensure CDI works for this lib
import com.fasterxml.jackson.databind.ObjectMapper;
import io.quarkus.jackson.ObjectMapperCustomizer;
import io.quarkus.runtime.Startup;
import org.ivoa.dm.proposal.management.ProposalManagementModel;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

/**
 * A custom objectMapper for proposalDM.
 * see https://quarkus.io/guides/rest-json#json
 */
public class CustomObjectMapper {
    private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory
          .getLogger(CustomObjectMapper.class);

    // Replaces the CDI producer for ObjectMapper built into Quarkus
    @Singleton
    @Produces
    ObjectMapper objectMapper(Instance<ObjectMapperCustomizer> customizers) {
        ObjectMapper mapper = ProposalManagementModel.jsonMapper(); // Custom `ObjectMapper`
        logger.info("custom jackson mapper used");
        // Apply all ObjectMapperCustomizer beans (incl. Quarkus)
        for (ObjectMapperCustomizer customizer : customizers) {
            customizer.customize(mapper);
        }

        return mapper;
    }
}

