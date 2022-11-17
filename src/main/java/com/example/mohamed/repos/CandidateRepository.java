package com.example.mohamed.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.mohamed.entities.Candidate;
import com.example.mohamed.entities.Category;

@RepositoryRestResource(path = "rest")
public interface CandidateRepository extends JpaRepository<Candidate, Long> {

	List<Candidate> findByFirstname(String nom);
	
	List<Candidate> findByFirstnameContains(String nom);
	
	@Query("select c from Candidate c where c.bacgeneration = '%?'")
	List<Candidate> findByBacGeneration(int bac);
	 
	List<Candidate> findByCategory(Category category);
	 
	List<Candidate> findByCategoryIdCat(Long id);
	
	List<Candidate> findByOrderByFirstnameAsc();
	
	@Query("select c from Candidate c order by c.firstname ASC, c.bacgeneration DESC")
	List<Candidate> listCandidatesFirstnameBacgeneration ();
}
