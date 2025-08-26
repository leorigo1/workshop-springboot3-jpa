package com.example.LeonardoRigo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoRigo.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
