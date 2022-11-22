package com.example.mohamed;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.mohamed.entities.Candidate;
import com.example.mohamed.entities.Category;
import com.example.mohamed.repos.CandidateRepository;

@SpringBootTest
class BourseAppApplicationTests {

		@Autowired
		private CandidateRepository candidateRepository;
		
		@Test
		public void testCreateCandidate() {
			Candidate candidate = new Candidate(25414, "Ahmed", "limem", 2017);
			candidateRepository.save(candidate);
		}
		
		@Test
		public void testFindCandidate()
		{
		Candidate p = candidateRepository.findById(1L).get();
		System.out.println(p);
		}
		
		@Test
		public void testUpdateCandidate() {
			Candidate c = candidateRepository.findById(1L).get();
			c.setBacGeneration(2020);
			candidateRepository.save(c);
		}
		
		@Test
		public void testDeleteCandidate() {
			candidateRepository.deleteById(1L);
		}
		
		@Test
		public void testListAllCandidate() {
			List<Candidate> candids = candidateRepository.findAll();
			for(Candidate c : candids) {
				System.out.println(c);
			}
		}
		
		@Test
		public void testfindByFirstnameCandidate() {
			List<Candidate> candids = candidateRepository.findByFirstname("Mohamed");
			for(Candidate c : candids) {
				System.out.println(c);
			}
		}
		
		@Test
		public void testfindByFirstnameCandidateContains() {
			List<Candidate> candids = candidateRepository.findByFirstnameContains("Moha");
			for(Candidate c : candids) {
				System.out.println(c);
			}
		}
	
		@Test
		public void testfindByBacGeneration() {
			List<Candidate> candids = candidateRepository.findByBacGeneration(2018);
			for(Candidate c : candids) {
				System.out.println(c);
			}
		}
		
		@Test
		public void testfindByCategory() {
			Category cat = new Category();
			cat.setIdCat(1L);
			List<Candidate> candids = candidateRepository.findByCategory(cat);
			for(Candidate c : candids) {
				System.out.println(c);
			}
		}
		
		@Test
		public void findByCategorieIdCat()
		{
		List<Candidate> candidates = candidateRepository.findByCategoryIdCat(1L);
		for (Candidate c : candidates)
			{
				System.out.println(c);
			}
		}
		
		@Test
		public void testfindByOrderByNomProduitAsc()
		{
		List<Candidate> prods = candidateRepository.findByOrderByFirstnameAsc();
		for (Candidate c : prods)
			{
				System.out.println(c);
			}
		}
		
		@Test
		public void testlistCandidatesFirstnameBacgeneration() {
			List<Candidate> prods = candidateRepository.listCandidatesFirstnameBacgeneration();
			for (Candidate c : prods){
				System.out.println(c);
			}
		}
		

}
