package org.orph2020.pst.common.json;

import java.util.ArrayList;
import java.util.List;

public class OpticalTelescopeClone {
    private String proposalID;
    private String cloneID;
    private List<Long> obsIds;
    private List<Long> cloneObsIDs;

    public OpticalTelescopeClone(
            String proposalID, String cloneID, List<Long> obsIds,
            List<Long> cloneObsIDs) {
        this.proposalID = proposalID;
        this.cloneID = cloneID;
        this.obsIds = obsIds;
        this.cloneObsIDs = cloneObsIDs;
    }

    public OpticalTelescopeClone() {}

    public String getProposalID() {
        return proposalID;
    }

    public void setProposalID(String proposalID) {
        this.proposalID = proposalID;
    }

    public String getCloneID() {
        return cloneID;
    }

    public void setCloneID(String cloneID) {
        this.cloneID = cloneID;
    }

    public List<Long> getObsIds() {
        return obsIds;
    }

    public void setObsIds(List<Long> obsIds) {
        this.obsIds = obsIds;
    }

    public List<Long> getCloneObsIDs() {
        return cloneObsIDs;
    }

    public void setCloneObsIDs(List<Long> cloneObsIDs) {
        this.cloneObsIDs = cloneObsIDs;
    }
}
