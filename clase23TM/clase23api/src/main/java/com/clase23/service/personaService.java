package com.clase23.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.clase23.entity.Persona;
import com.clase23.repository.iPersonaRepo;

@Service
public class personaService {
	@Autowired
	private iPersonaRepo personaRepo;
	
	//GET ALL
	public List<Persona> getAllPerson()
	{
		return personaRepo.findAll();
	}
	
	//GET ONE	
	public Optional<Persona> findById(Long id){
		return personaRepo.findById(id);
	}
	
	//DELETE
	public void deletePerson(Long id){
		personaRepo.deleteById(id);
	}
	
	//SAVE
	public Persona save(Persona p) {
		return personaRepo.save(p);
	}
	
	public iPersonaRepo getPersonaRepo() {
		return personaRepo;
	}

	public void setPersonaRepo(iPersonaRepo personaRepo) {
		this.personaRepo = personaRepo;
	}
}
