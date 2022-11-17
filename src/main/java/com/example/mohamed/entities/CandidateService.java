package com.example.mohamed.entities;

import java.util.List;

public interface CandidateService {
	
	Candidate saveCandidate(Candidate c);
	Candidate updateCandidate(Candidate c);
	void deleteCandidate(Candidate c);
	void deleteCandidateById(Long id);
	Candidate getCandidate(Long id);
	List<Candidate> getAllCandidate();
	List<Candidate> findByFirstname(String nom);
	List<Candidate> findByFirstnameContains(String nom);
	List<Candidate> findByBacGeneration(int bac);
	List<Candidate> findByCategory(Category category);
	List<Candidate> findByCategoryIdCat(Long id);
	List<Candidate> findByOrderByFirstnameAsc();
	List<Candidate> listCandidatesFirstnameBacgeneration ();

}
