package org.orph2020.pst.common.json;

import org.ivoa.dm.proposal.prop.Observation;

import java.util.ArrayList;
import java.util.List;

public class submittedProposalResponse {
    private List<Observation> obs;
    private String id;

    public submittedProposalResponse(List<Observation> obs, String id) {
        this.obs = obs;
        this.id = id;
    }

    public submittedProposalResponse() {}

    public List<Observation> getObs() {
        return obs;
    }

    public void setObs(List<Observation> obs) {
        this.obs = obs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
