package com.example.LeonardoRigo.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LeonardoRigo.demo.entities.User;
import com.example.LeonardoRigo.demo.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById (Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}
	
}
