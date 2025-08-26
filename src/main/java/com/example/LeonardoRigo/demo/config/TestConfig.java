package com.example.LeonardoRigo.demo.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.LeonardoRigo.demo.entities.Order;
import com.example.LeonardoRigo.demo.entities.User;
import com.example.LeonardoRigo.demo.repositories.OrderRepository;
import com.example.LeonardoRigo.demo.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository	orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Pé de pano", "pedepano@gmail.com", "97777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:19:53.07Z"),u1);
		Order o2 = new Order(null, Instant.parse("2016-03-10T12:39:33.07Z"),u2);
		Order o3 = new Order(null, Instant.parse("2013-07-08T11:36:22.22Z"),u1);
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
