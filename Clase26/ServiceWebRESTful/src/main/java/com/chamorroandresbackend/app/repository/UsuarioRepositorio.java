package com.chamorroandresbackend.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chamorroandresbackend.app.entity.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByEmail(String email);
	public Optional<Usuario> findByUsernameOrEmail(String username,String email);
	public Optional<Usuario> findByUsername(String username);
}
