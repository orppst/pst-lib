package org.orph2020.pst.common.json;

import java.util.HashMap;

public class OpticalTelescopeData {
    public String proposalID;
    public String observationID;
    public String telescopeName;
    HashMap<String, String> choices;

    public OpticalTelescopeData(
            String proposalID, String observationID, String telescopeName,
            HashMap<String, String> choices) {
        this.proposalID = proposalID;
        this.observationID = observationID;
        this.telescopeName = telescopeName;
        this.choices = choices;
    }
}
