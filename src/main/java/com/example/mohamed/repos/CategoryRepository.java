package com.example.mohamed.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mohamed.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
