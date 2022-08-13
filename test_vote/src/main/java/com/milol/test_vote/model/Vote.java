package com.milol.test_vote.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Vote {
	
	@EmbeddedId
	private VoteId pk ;
	private Boolean upvote;
	
	
	public Boolean getUpvote() {
		return upvote;
	}
	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
	
	
	
	
	
	
    
}
