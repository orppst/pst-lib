package org.orph2020.pst.common.json;

import org.ivoa.dm.proposal.management.ReviewedProposal;

import java.util.Date;

/**
 *  Ancillary class to contain relevant metadata about a ReviewedProposal without
 *  having to return all the data contained in the proposal it references
 */
public class ReviewedProposalSynopsis {

    public long dbId;

    public Date completedDate;

    public Boolean successStatus;

    public long numberOfReviewers;

    public long reviewsCompleted;

    public String proposalTitle;

    public ReviewedProposalSynopsis(ReviewedProposal reviewedProposal)
    {
        this.dbId = reviewedProposal.getId();
        this.completedDate = reviewedProposal.getReviewsCompleteDate();
        this.successStatus = reviewedProposal.getSuccessful();
        this.numberOfReviewers = reviewedProposal.getReviews().size();

        //assumes new dates that are yet to be updated are added as new Date(0L)
        this.reviewsCompleted = reviewedProposal.getReviews().stream()
                .filter(rp -> rp.getReviewDate().compareTo(new Date(0L)) > 0)
                .count();

        this.proposalTitle = reviewedProposal.getSubmitted().getProposal().getTitle();
    }



}
