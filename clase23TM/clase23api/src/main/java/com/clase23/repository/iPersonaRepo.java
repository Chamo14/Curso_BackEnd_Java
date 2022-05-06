package com.clase23.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clase23.entity.Persona;

public interface iPersonaRepo extends JpaRepository<Persona, Long> {

}
