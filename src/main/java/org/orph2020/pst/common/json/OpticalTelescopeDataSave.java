package org.orph2020.pst.common.json;

import java.util.HashMap;

public class OpticalTelescopeDataSave extends OpticalTelescopeDataLoad{
    // the new states of the choices.
    HashMap<String, String> choices;

    // the telescope name.
    public String telescopeName;

    /**
     * constructor for the telescope data for saving.
     *
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     * @param telescopeName: the telescope name.
     * @param choices: the choices made.
     */
    public OpticalTelescopeDataSave(
            String proposalID, String observationID, String telescopeName,
            HashMap<String, String> choices) {
        super(proposalID, observationID);
        this.telescopeName = telescopeName;
        this.choices = choices;
    }
}
