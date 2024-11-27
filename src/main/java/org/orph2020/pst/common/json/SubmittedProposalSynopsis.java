package org.orph2020.pst.common.json;

/*
 Ancillary class to contain more information about submitted proposals than the ObjectIdentifier class
 basically the equivalent thing for submitted proposals as ProposalSynopsis is for source proposals.
 */

import org.ivoa.dm.proposal.prop.AbstractProposal;
import org.ivoa.dm.proposal.prop.ProposalKind;

import java.util.Date;


public class SubmittedProposalSynopsis {

    //code / db id
    public long code;

    //title
    public String title;

    //summary
    public String summary;

    //kind (of observation - see enum)
    public ProposalKind kind;

    //source proposal id
    public long sourceProposalId;

    //cycle id - the observing cycle it's been submitted to.
    public long cycleId;

    //submission date
    public Date submissionDate;

    //The current review status
    public String reviewStatus;


    public SubmittedProposalSynopsis(long code, String title, String summary, ProposalKind kind, long sourceProposalId, long cycleId, Date submissionDate, String reviewStatus)
    {
        this.code = code;
        this.title = title;
        this.summary = summary;
        this.kind = kind;
        this.sourceProposalId = sourceProposalId;
        this.cycleId = cycleId;
        this.submissionDate = submissionDate;
        this.reviewStatus = reviewStatus;
    }


    public SubmittedProposalSynopsis(AbstractProposal submittedProposal)
    {
        this.code = submittedProposal.getId();
        this.title = submittedProposal.getTitle();
        this.summary = submittedProposal.getSummary();
        this.kind = submittedProposal.getKind();
        if(!submittedProposal.getRelatedProposals().isEmpty())
            this.sourceProposalId = submittedProposal.getRelatedProposals().get(0).getId();
        //TODO: Populate cycleID and reviewStatus
        this.reviewStatus = "UNKNOWN";
    }

    public SubmittedProposalSynopsis() {}

}
