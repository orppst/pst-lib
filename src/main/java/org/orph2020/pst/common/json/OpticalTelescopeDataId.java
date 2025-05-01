package org.orph2020.pst.common.json;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


@Embeddable
public class OpticalTelescopeDataId implements Serializable {

    private String proposalID;
    private String observationID;

    public OpticalTelescopeDataId() {
    }

    public OpticalTelescopeDataId(String proposalID, String observationID) {
        this.proposalID = proposalID;
        this.observationID = observationID;
    }

    public String getProposalID() {
        return proposalID;
    }

    public void setProposalID(String proposalID) {
        this.proposalID = proposalID;
    }

    public String getObservationID() {
        return observationID;
    }

    public void setObservationID(String observationID) {
        this.observationID = observationID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpticalTelescopeDataId that = (OpticalTelescopeDataId) o;
        return Objects.equals(proposalID, that.proposalID) &&
               Objects.equals(observationID, that.observationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proposalID, observationID);
    }

    @Override
    public String toString() {
        return "OpticalTelescopeDataId{" +
                "proposalID='" + proposalID + '\'' +
                ", observationID='" + observationID + '\'' +
                '}';
    }
}