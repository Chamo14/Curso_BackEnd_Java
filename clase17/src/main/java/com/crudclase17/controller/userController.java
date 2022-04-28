package com.crudclase17.controller;

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

import com.crudclase17.entity.User;
import com.crudclase17.service.userService;

@RestController
@RequestMapping("/api/users")
public class userController {
	
	@Autowired
	private userService uService;
	
	//POST USER
	@PostMapping("/createUser")
	public ResponseEntity<?> create(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(uService.saveUser(user));
	}
	
	//GET USER
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable Long id){
		Optional<User> oUser = uService.findById(id);
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(null);
	}
	
	//UPDATE USER
	@PutMapping("/{id}")
	public ResponseEntity<?> updateUser(@RequestBody User uDetails ,@PathVariable(value = "id") Long id)
	{
		Optional<User> oUser = uService.findById(id);
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		oUser.get().setName(uDetails.getName());
		oUser.get().setUsername(uDetails.getUsername());
		oUser.get().setPassword(uDetails.getPassword());
		oUser.get().setEmail(uDetails.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(uService.saveUser(oUser.get()));
	}
	
	//DELETE USER
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable (value ="id") Long id){
		if(!uService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		uService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
	



	
	


