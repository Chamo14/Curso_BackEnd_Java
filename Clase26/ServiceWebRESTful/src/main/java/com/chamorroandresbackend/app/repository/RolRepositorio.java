package com.chamorroandresbackend.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chamorroandresbackend.app.entity.Rol;

@Repository
public interface RolRepositorio extends JpaRepository<Rol, Long>{
	public Optional<Rol> findByNombre(String nombre);

}
