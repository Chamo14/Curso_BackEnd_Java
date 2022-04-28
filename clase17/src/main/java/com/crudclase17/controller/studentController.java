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

import com.crudclase17.entity.Student;

import com.crudclase17.service.studentService;


@RestController
@RequestMapping("/api/students")
public class studentController  {
	
	@Autowired
	private studentService uService;
	
	//POST STUDENT
	@PostMapping("/createStudent")
	public ResponseEntity<?> createStudent(@RequestBody Student student){
		return ResponseEntity.status(HttpStatus.CREATED).body(uService.saveStudent(student));
	}
	
	//GET STUDENT
	@GetMapping("/{id}")
	public ResponseEntity<?> readStudent(@PathVariable Long id){
		Optional<Student> oStudent = uService.findById(id);
		if(!oStudent.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(null);
	}
	
	//UPDATE STUDENT
	@PutMapping("/{id}")
	public ResponseEntity<?> updateStudent(@RequestBody Student uDetails ,@PathVariable(value = "id") Long id)
	{
		Optional<Student> oStudent = uService.findById(id);
		if(!oStudent.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		oStudent.get().setName(uDetails.getName());
		oStudent.get().setSurname(uDetails.getSurname());
		oStudent.get().setTelephone(uDetails.getTelephone());
		oStudent.get().setDni(uDetails.getDni());
		return ResponseEntity.status(HttpStatus.CREATED).body(uService.saveStudent(oStudent.get()));
	}
	
	//DELETE STUDENT
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable (value ="id") Long id){
		if(!uService.findById(id).isPresent()) {
			return ResponseEntity.notFound().build();
		}
		uService.deleteById(id);
		return ResponseEntity.ok().build();
	}
}