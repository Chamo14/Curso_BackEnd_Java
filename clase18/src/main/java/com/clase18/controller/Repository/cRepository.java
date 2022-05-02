package com.clase18.controller.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.clase18.model.Client;

@Repository
public interface cRepository extends CrudRepository<Client, Long> {


}
