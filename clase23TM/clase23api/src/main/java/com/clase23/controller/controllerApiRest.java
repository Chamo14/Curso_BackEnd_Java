package com.clase23.controller;

import java.util.List;
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

import com.clase23.entity.Persona;
import com.clase23.service.personaService;

@RestController
@RequestMapping("/apiPersona")
public class controllerApiRest {
	@Autowired
	personaService pService;
	
	//GET ALL
	@GetMapping("/listar")
	public List<Persona> listarPersonas(){
		return pService.getAllPerson();
	}
	//POST PERSONA
	@PostMapping
	public ResponseEntity<?> agregarPersona(@RequestBody Persona p) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pService.save(p));
	}
	
	//PUT PERSONA
	@PutMapping("/{id}")
	public ResponseEntity<?> editarPersona(@RequestBody Persona p,@PathVariable (value="id") Long id){
		Optional<Persona> persona = pService.findById(id);
		if(!persona.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		persona.get().setDni(p.getDni());
		persona.get().setName(p.getName());
		persona.get().setSurname(p.getSurname());
		persona.get().setTelephone(p.getTelephone());
		return ResponseEntity.status(HttpStatus.CREATED).body(pService.save(persona.get()));
	}
	
	//DELETE PERSONA
	@DeleteMapping("/{id}")
	public ResponseEntity<?> borrarPersona(@PathVariable("id") Long id)
	{
		if(!pService.findById(id).isPresent())
		{
			return ResponseEntity.notFound().build();
		}
		pService.deletePerson(id);
		return ResponseEntity.ok().build();
	}
}
