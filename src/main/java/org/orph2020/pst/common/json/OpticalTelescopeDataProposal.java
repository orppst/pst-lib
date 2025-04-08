package org.orph2020.pst.common.json;

/**
 * creates a holder for the proposal id only.
 */
public class OpticalTelescopeDataProposal {
    // the proposal id
    private String proposalID;

    // default constructor.
    public OpticalTelescopeDataProposal() {
    }

    /**
     * constructor.
     *
     * @param proposalID the proposal id.
     */
    public OpticalTelescopeDataProposal(String proposalID) {
        this.proposalID = proposalID;
    }

    public String getProposalID() {
        return proposalID;
    }

    public void setProposalID(String proposalID) {
        this.proposalID = proposalID;
    }
}
