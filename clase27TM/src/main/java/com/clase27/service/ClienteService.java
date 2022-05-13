package com.clase27.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase27.entity.Cliente;
import com.clase27.repository.IClientesRepo;

@Service
public class ClienteService  {
	@Autowired
	private IClientesRepo cRepo;
	
	//Listar clientes
	public List<Cliente> findAll(){
		return cRepo.findAll();
	}
	//Listar un solo cliente
	public Optional<Cliente> findById(Long id){
		if(cRepo.existsById(id)) {
			return cRepo.findById(id);
		}
		return null;
	}
	//Crear cliente
	public Cliente save(Cliente cliente) {
		return cRepo.save(cliente);
	}
	
	//Actualizar cliente
	public Cliente update(Cliente cliente) {
		if(cRepo.existsById(cliente.getId())) {
			return cRepo.save(cliente);
		}
		return null;
	}
	
	
	//Eliminar cliente
	public boolean delete(Long id) {
		if(cRepo.existsById(id)) {
			cRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
