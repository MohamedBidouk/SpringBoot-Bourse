package com.example.mohamed.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mohamed.entities.Candidate;
import com.example.mohamed.entities.CandidateService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CandidateRESTController {
	
	@Autowired
	CandidateService candidateService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Candidate> getAllCandidate() {
		return candidateService.getAllCandidate();	
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Candidate getCandidateById(@PathVariable("id") Long id) {
		return candidateService.getCandidate(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidate createCandidate(@RequestBody Candidate candidate) {
		return candidateService.saveCandidate(candidate);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Candidate updateCandidate(@RequestBody Candidate candidate) {
		return candidateService.updateCandidate(candidate);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletecandidate(@PathVariable("id") Long id){
	candidateService.deleteCandidateById(id);
	}
	
	@RequestMapping(value="/candidscat/{idCat}",method = RequestMethod.GET)
	public List<Candidate> getCandidatesByCatId(@PathVariable("idCat") Long idCat) {
		return candidateService.findByCategoryIdCat(idCat);
	}
}