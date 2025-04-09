package org.orph2020.pst.common.json;

// data type for the loading of the optional telescope data.
public class OpticalTelescopeDataLoad extends OpticalTelescopeDataProposal {

    // the observation id for the telescope data.
    private String observationID;

    /**
     * the constructor for the data saved within the database for a given
     * observation.
     * @param proposalID: the proposal id.
     * @param observationID: the observation id.
     */
    public OpticalTelescopeDataLoad(String proposalID, String observationID) {
        super(proposalID);
        this.observationID = observationID;
    }

    /**
     * the default constructor for the data saved within the database for a given
     * observation.
     */
    public OpticalTelescopeDataLoad() {
        super(null);
        this.observationID = null;
    }

    public String getObservationID() {
        return observationID;
    }

    public void setObservationID(String observationID) {
        this.observationID = observationID;
    }
}
