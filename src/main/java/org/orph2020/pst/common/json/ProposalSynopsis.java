package org.orph2020.pst.common.json;

/*
 Ancillary class to contain more information about an ObservingProposal than the ObjectIdentifier class
 but significantly less information than held in an entire ObservingProposal object
 */

import org.ivoa.dm.proposal.prop.ObservingProposal;
import org.ivoa.dm.proposal.prop.ProposalKind;


public class ProposalSynopsis {

    //code / db id
    public long code;

    //title
    public String title;

    //summary
    public String summary;

    //kind (of observation - see enum)
    public ProposalKind kind;

    //submitted status
    public Boolean submitted;


    public ProposalSynopsis(long code, String title, String summary, ProposalKind kind, Boolean submitted)
    {
        this.code = code;
        this.title = title;
        this.summary = summary;
        this.kind = kind;
        this.submitted = submitted;
    }


    public ProposalSynopsis(ObservingProposal proposal)
    {
        this.code = proposal.getId();
        this.title = proposal.getTitle();
        this.summary = proposal.getSummary();
        this.kind = proposal.getKind();
        this.submitted = proposal.getSubmitted();
    }

    public ProposalSynopsis() {}

}
