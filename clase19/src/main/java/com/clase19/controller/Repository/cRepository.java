package com.clase19.controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clase19.model.Client;

@Repository
public interface cRepository extends JpaRepository<Client, Long> {


}
