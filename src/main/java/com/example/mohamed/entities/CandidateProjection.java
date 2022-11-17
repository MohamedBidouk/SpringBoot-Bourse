package com.example.mohamed.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "firstnameCand", types = { Candidate.class})
public interface CandidateProjection {
	
	public String getFirstname();

}
