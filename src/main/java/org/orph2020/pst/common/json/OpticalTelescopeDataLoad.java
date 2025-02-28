package org.orph2020.pst.common.json;

// data type for the loading of the optional telescope data.
public class OpticalTelescopeDataLoad {
    // the proposal id.
    public String proposalID;

    // the observation id for the telescope data.
    public String observationID;

    /**
     * the constructor for the data saved within the database for a given
     * observation.
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     */
    public OpticalTelescopeDataLoad(String proposalID, String observationID) {
        this.proposalID = proposalID;
        this.observationID = observationID;
    }
}
