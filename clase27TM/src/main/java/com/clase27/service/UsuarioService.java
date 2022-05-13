package com.clase27.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase27.entity.Usuario;
import com.clase27.repository.IUsuariosRepo;

@Service
public class UsuarioService {
	
	@Autowired
	private IUsuariosRepo uRepo;
	
	//Listar
	public List<Usuario> findAll(){
		return uRepo.findAll();
	}
	//Retornar un usuario
	public Optional<Usuario> findById(Long id) {
		if(uRepo.existsById(id)) {
			return uRepo.findById(id);
		}
		return null;
	}
	//Crear 
	public Usuario save(Usuario usuario) {
		return uRepo.save(usuario);
	}
	
	//Editar
	public Usuario update(Usuario usuario) {
		if(uRepo.existsById(usuario.getId())) {
		return uRepo.save(usuario);
		}
		return null;
	}
	//Eliminar
	public boolean delete(Long id) {
		if(uRepo.existsById(id)) {
			uRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
