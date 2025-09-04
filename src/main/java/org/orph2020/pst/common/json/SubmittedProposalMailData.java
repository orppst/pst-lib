package org.orph2020.pst.common.json;

/*
Convenience class to aggregate the data for the emails sent to investigators at various points in the
proposal submission, review, and allocation processes.
 */

import jakarta.ws.rs.WebApplicationException;
import org.ivoa.dm.proposal.management.ProposalCycle;
import org.ivoa.dm.proposal.management.ProposalReview;
import org.ivoa.dm.proposal.management.SubmittedProposal;
import org.ivoa.dm.proposal.prop.Investigator;
import org.ivoa.dm.proposal.prop.InvestigatorKind;

import java.util.ArrayList;
import java.util.List;

public class SubmittedProposalMailData {

    public String cycle;
    public String submissionDeadline;
    public String title;
    public String principalName;
    public List<String> otherNames;
    public Boolean isSuccessful;
    public List<String> reviews;
    
    public SubmittedProposalMailData(SubmittedProposal submittedProposal, ProposalCycle proposalCycle) {
        this.cycle = proposalCycle.getTitle();
        this.submissionDeadline = proposalCycle.getSubmissionDeadline().toString();
        this.title = submittedProposal.getTitle();

        List<Investigator> investigators = submittedProposal.getInvestigators();

        Investigator principalInvestigator = investigators
                .stream()
                .filter(i -> i.getType().equals(InvestigatorKind.PI))
                .findFirst()
                .orElseThrow(
                        () -> new WebApplicationException("No principal investigator found", 404)
                ); //every proposal should have a nominated PI so this shouldn't occur

        this.principalName = principalInvestigator.getPerson().getFullName();

        //this list can be empty i.e., principal investigator only, no co-investigators
        List<Investigator> otherInvestigators = investigators
                .stream()
                .filter(i -> i.getType().equals(InvestigatorKind.COI))
                .toList();

        this.otherNames = new ArrayList<>();

        //if otherInvestigators is empty this loop is skipped and otherNames remains empty
        for(Investigator investigator : otherInvestigators) {
            this.otherNames.add(investigator.getPerson().getFullName());
        }

        this.isSuccessful = submittedProposal.getSuccessful();

        List<ProposalReview> reviews = submittedProposal.getReviews();

        this.reviews = new ArrayList<>();

        for (ProposalReview review : reviews) {
            this.reviews.add(review.getComment());
        }
    }

}
