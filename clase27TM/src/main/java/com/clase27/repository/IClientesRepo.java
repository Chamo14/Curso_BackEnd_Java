package com.clase27.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clase27.entity.Cliente;

@Repository
public interface IClientesRepo extends JpaRepository<Cliente, Long> {

}
