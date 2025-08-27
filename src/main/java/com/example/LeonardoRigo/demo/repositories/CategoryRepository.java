package com.example.LeonardoRigo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoRigo.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
