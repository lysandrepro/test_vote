package com.milol.test_vote.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;



@Embeddable
public class VoteId implements Serializable{
		
	/**
		 * 
		 */
	private static final long serialVersionUID = -859321254394723900L;
	
	@ManyToOne
	private Feature feature;
	
	@ManyToOne
	private User user;
	
	
	
	public Feature getFeatures() {
		return feature;
	}
	public void setFeatures(Feature features) {
		this.feature = features;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public static long getSerialversionuid() {
			return serialVersionUID;
		}

	
	

}
