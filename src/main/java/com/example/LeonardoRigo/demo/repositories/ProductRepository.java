package com.example.LeonardoRigo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoRigo.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
