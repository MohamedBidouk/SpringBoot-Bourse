package com.example.mohamed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mohamed.entities.Candidate;
import com.example.mohamed.entities.CandidateService;
import com.example.mohamed.entities.Category;
import com.example.mohamed.repos.CandidateRepository;

@Service
public class CandidateServiceImpl implements CandidateService{
	@Autowired
	CandidateRepository candidateRepository;

	@Override
	public Candidate saveCandidate(Candidate c) {
		// TODO Auto-generated method stub
		return candidateRepository.save(c);
	}

	@Override
	public Candidate updateCandidate(Candidate c) {
		// TODO Auto-generated method stub
		return candidateRepository.save(c);
	}

	@Override
	public void deleteCandidate(Candidate c) {
		candidateRepository.delete(c);
	}

	@Override
	public void deleteCandidateById(Long id) {
		// TODO Auto-generated method stub
		candidateRepository.deleteById(id);
	}

	@Override
	public Candidate getCandidate(Long id) {
		// TODO Auto-generated method stub
		return candidateRepository.findById(id).get();
	}

	@Override
	public List<Candidate> getAllCandidate() {
		// TODO Auto-generated method stub
		return candidateRepository.findAll();
	}

	@Override
	public List<Candidate> findByFirstname(String nom) {
		return candidateRepository.findByFirstname(nom);
	}

	@Override
	public List<Candidate> findByFirstnameContains(String nom) {
		return candidateRepository.findByFirstnameContains(nom);
	}

	@Override
	public List<Candidate> findByBacGeneration(int bac) {
		return candidateRepository.findByBacGeneration(bac);
	}

	@Override
	public List<Candidate> findByCategory(Category category) {
		return candidateRepository.findByCategory(category);
	}

	@Override
	public List<Candidate> findByCategoryIdCat(Long id) {
		return candidateRepository.findByCategoryIdCat(id);
	}

	@Override
	public List<Candidate> findByOrderByFirstnameAsc() {
		return candidateRepository.findByOrderByFirstnameAsc();
	}

	@Override
	public List<Candidate> listCandidatesFirstnameBacgeneration() {
		return candidateRepository.listCandidatesFirstnameBacgeneration();
	}
	
	

}
