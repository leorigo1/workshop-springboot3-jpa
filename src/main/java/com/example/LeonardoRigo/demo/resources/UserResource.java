package com.example.LeonardoRigo.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LeonardoRigo.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User (1L,"leopardo","leopardo@gmail.com","93491293","l1e2o3n4");
		return ResponseEntity.ok().body(u);
	}
	
}
