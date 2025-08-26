package com.example.LeonardoRigo.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LeonardoRigo.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
