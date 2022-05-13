package com.clase27.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clase27.entity.Usuario;

@Repository
public interface IUsuariosRepo extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsername(String username);
	public Optional<Usuario> findByEmail(String email);
	public Optional<Usuario> findByUsernameOrEmail(String username,String email);
	
}
