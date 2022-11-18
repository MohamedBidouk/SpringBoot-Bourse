package com.example.mohamed.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.mohamed.entities.Category;

@RepositoryRestResource(path = "cat")
@CrossOrigin("http://localhost:4200/") //to accept Angular
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
