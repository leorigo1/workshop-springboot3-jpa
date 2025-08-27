package com.example.LeonardoRigo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LeonardoRigo.demo.entities.Category;
import com.example.LeonardoRigo.demo.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	
	public Category findById (Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
	
}
