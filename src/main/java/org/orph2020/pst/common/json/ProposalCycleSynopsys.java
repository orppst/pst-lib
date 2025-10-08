package org.orph2020.pst.common.json;

import org.ivoa.dm.proposal.management.Observatory;

import java.util.Date;

public class ProposalCycleSynopsys {
    public String title;
    public String code;
    public Date submissionDeadline;
    public Date observationSessionStart;
    public Date observationSessionEnd;
    public Observatory observatory;

    public ProposalCycleSynopsys(String title, String code, Date submissionDeadline, Date observationSessionStart, Date observationSessionEnd, Observatory observatory)
    {
        this.title = title;
        this.code = code;
        this.submissionDeadline = submissionDeadline;
        this.observationSessionStart = observationSessionStart;
        this.observationSessionEnd = observationSessionEnd;
        this.observatory = observatory;
    }

    public ProposalCycleSynopsys() {}
}
