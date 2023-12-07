package org.orph2020.pst.common.json;

import java.util.Date;

public class ProposalCycleDates {
    public String title;
    public Date submissionDeadline;
    public Date observationSessionStart;
    public Date observationSessionEnd;

    public ProposalCycleDates(String title, Date submissionDeadline, Date observationSessionStart, Date observationSessionEnd)
    {
        this.title = title;
        this.submissionDeadline = submissionDeadline;
        this.observationSessionStart = observationSessionStart;
        this.observationSessionEnd = observationSessionEnd;
    }

    public ProposalCycleDates() {}
}
