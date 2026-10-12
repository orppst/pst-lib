package org.orph2020.pst.common.json;

import org.ivoa.dm.proposal.management.Observatory;

import java.time.ZonedDateTime;


public class ProposalCycleSynopsis {
    public String title;
    public String code;
    public ZonedDateTime submissionDeadline;
    public ZonedDateTime observationSessionStart;
    public ZonedDateTime observationSessionEnd;
    public Observatory observatory;

    public ProposalCycleSynopsis(String title, String code, ZonedDateTime submissionDeadline, ZonedDateTime observationSessionStart, ZonedDateTime observationSessionEnd, Observatory observatory)
    {
        this.title = title;
        this.code = code;
        this.submissionDeadline = submissionDeadline;
        this.observationSessionStart = observationSessionStart;
        this.observationSessionEnd = observationSessionEnd;
        this.observatory = observatory;
    }

    public ProposalCycleSynopsis() {}
}
