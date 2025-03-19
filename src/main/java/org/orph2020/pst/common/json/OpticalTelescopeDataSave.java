package org.orph2020.pst.common.json;

import java.util.HashMap;

public class OpticalTelescopeDataSave extends OpticalTelescopeDataLoad {
    // the new states of the choices.
    public HashMap<String, String> choices;

    // the telescope name.
    public String telescopeName;

    // the instrument name.
    public String instrumentName;

    /**
     * constructor for the telescope data for saving.
     *
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     * @param telescopeName: the telescope name.
     * @param instrumentName: the instrument name chosen for the choices.
     * @param choices: the choices made.
     */
    public OpticalTelescopeDataSave(
            String proposalID, String observationID, String telescopeName,
            String instrumentName, HashMap<String, String> choices) {
        super(proposalID, observationID);
        this.telescopeName = telescopeName;
        this.instrumentName = instrumentName;
        this.choices = choices;
    }

    public HashMap<String, String> getChoices() {
        return choices;
    }

    public String getTelescopeName() {
        return telescopeName;
    }

    public String getInstrumentName() {
        return instrumentName;
    }
}
