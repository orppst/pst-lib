package org.orph2020.pst.apiimpl.client;
/*
 * Created on 16/03/2023 by Paul Harrison (paul.harrison@manchester.ac.uk).
 */

import io.quarkus.oidc.client.reactive.filter.OidcClientRequestReactiveFilter;
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.ivoa.dm.proposal.management.*;
import org.ivoa.dm.proposal.prop.ObservingProposal;
import org.ivoa.dm.proposal.prop.Person;
import org.orph2020.pst.common.json.ObjectIdentifier;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.Set;

@RegisterRestClient(configKey="proposal-api")
@RegisterProvider(OidcClientRequestReactiveFilter.class)
public interface ProposalRestAPI {

   // ------ Observatories ----------//
   @Path("observatories")
   @GET
   Set<ObjectIdentifier> getObservatories();

   @Path("observatories/{id}")
   @GET
   Observatory getObservatory(@PathParam("id") Long id);

   @Path("observatories")
   @POST
   Observatory createObservatory(Observatory observatory);

   @Path("observatories/{id}/telescopes")
   @POST
   Telescope createAndAddTelescopeToObservatory(@PathParam("id") Long id, Telescope telescope);

   @Path("observatories/{id}/instruments")
   @POST
   Instrument createAndAddInstrumentToObservatory(@PathParam("id") Long id, Instrument instrument);

   @Path("observatories/{id}/backend")
   @POST
   Backend createAndAddBackend(@PathParam("id") Long id, Backend backend);

   @Path("observatories/{id}/array")
   @POST
   TelescopeArray createAndAddArray(@PathParam("id") Long id, TelescopeArray telescopeArray);

   // ---------------------------//

   // ------ Proposals ----------//
   @Path("proposals")
   @GET
   Set<ObjectIdentifier> getProposals();

   @Path("proposals/{id}")
   @GET
   ObservingProposal getObservingProposal(@PathParam("id") long id);

   @Path("proposals")
   @POST
   @Consumes(MediaType.APPLICATION_JSON)
   ObservingProposal createObservingProposal(ObservingProposal newProposal);
   // ---------------------------//

   // ------ People ----------//
   @Path("people")
   @GET
   Set<ObjectIdentifier> getPeople();

   @Path("people/{id}")
   @GET
   Person getPerson(@PathParam("id") long id);

   @Path("people/{id}/fullName")
   @PUT
   @Consumes(MediaType.TEXT_PLAIN)
   Response updateFullName(@PathParam("id") long id, String replacementFullName);

   @Path("people/{id}/eMail")
   @PUT
   @Consumes(MediaType.TEXT_PLAIN)
   Response updateEMail(@PathParam("id") long id, String replacementEMail);
   // ---------------------------//

}
