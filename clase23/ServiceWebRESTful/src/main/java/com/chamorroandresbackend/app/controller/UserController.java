package com.chamorroandresbackend.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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

import com.chamorroandresbackend.app.entity.User;
import com.chamorroandresbackend.app.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//Create a new user POST
	@PostMapping("/insertUser")
	public ResponseEntity<?> create(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
	
	//Read an user GET
	@GetMapping("/{id}")
	public ResponseEntity<?> read(@PathVariable Long id){
		Optional<User> oUser = userService.findById(id);
		//VALIDACIONES SI EXISTE
		if(!oUser.isPresent()) {
			return ResponseEntity.notFound().build();//DEVUELVE 404
		}
		return ResponseEntity.ok(oUser);//DEVUELVE 200
	}
	
	//Update an user PUT EDITAR
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody User userDetails,@PathVariable(value = "id") Long userId){
		Optional<User> user =userService.findById(userId);
		if (!user.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		user.get().setName(userDetails.getName());
		user.get().setEmail(userDetails.getEmail());
		user.get().setSurname(userDetails.getSurname());
		user.get().setEnabled(userDetails.getEnabled());
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user.get()));
	}
	
	//Delete an user DELETE
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Long userId){
		if(!userService.findById(userId).isPresent()) {//comprobacion de usuario
			return ResponseEntity.notFound().build();
		}
		
		userService.deleteById(userId);
		return ResponseEntity.ok().build();//codigo 200 da ok 
	}
	
	//Read all User Leer todos los usuarios
	@GetMapping("/listUsers")
	public List<User> readAll(){
		List<User> users = StreamSupport//TRANSFORMA ITERABLE EN LISTA
				.stream(userService.findAll().spliterator(), false)//RECIBE EL ITERABLE
				.collect(Collectors.toList());//TRANSFORMACION
		return (List<User>) userService.findAll();
	}
}
	

