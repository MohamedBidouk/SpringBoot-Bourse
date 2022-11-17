package com.example.mohamed.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mohamed.entities.Category;
import com.example.mohamed.repos.CategoryRepository;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategoryRESTController {

	@Autowired
	CategoryRepository categoryRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> getAllCategories()
	{
	return categoryRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Category getCategoryById(@PathVariable("id") Long id) {
	return categoryRepository.findById(id).get();
	}
}
