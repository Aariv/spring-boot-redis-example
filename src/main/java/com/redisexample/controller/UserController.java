/**
 * 
 */
package com.redisexample.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redisexample.model.User;
import com.redisexample.repository.UserRepository;

/**
 * @author zentere
 *
 */
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}

	@GetMapping("/users")
	public Iterable<User> findAll() {
		return userRepository.findAll();
	}

	@GetMapping("/users/{id}")
	public Optional<User> findById(@PathVariable String id) {
		return userRepository.findById(id);
	}

	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable String id) {
		userRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/users")
	public User update(@RequestBody User user) {
		return userRepository.save(user);
	}
}
