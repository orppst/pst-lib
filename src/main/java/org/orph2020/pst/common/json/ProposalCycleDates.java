package org.orph2020.pst.common.json;

import org.ivoa.dm.proposal.management.Observatory;

import java.util.Date;

public class ProposalCycleDates {
    public String title;
    public Date submissionDeadline;
    public Date observationSessionStart;
    public Date observationSessionEnd;
    public Observatory observatory;

    public ProposalCycleDates(String title, Date submissionDeadline, Date observationSessionStart, Date observationSessionEnd, Observatory observatory)
    {
        this.title = title;
        this.submissionDeadline = submissionDeadline;
        this.observationSessionStart = observationSessionStart;
        this.observationSessionEnd = observationSessionEnd;
        this.observatory = observatory;
    }

    public ProposalCycleDates() {}
}
