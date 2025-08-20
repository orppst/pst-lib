package org.orph2020.pst.common.json;

/*
Convenience class to simplify the data for the emails sent to investigators after the TAC review meeting has
occurred and the results agreed. This couples this class to the "tacReviewResults.html" template email, though
Template Extensions in Qute could be used.
 */


import java.util.List;

public class SubmittedProposalMailData {

    public String cycle;
    public String title;
    public String principalName;
    public List<String> otherNames;
    public Boolean isSuccessful;
    public List<String> reviews;



}
