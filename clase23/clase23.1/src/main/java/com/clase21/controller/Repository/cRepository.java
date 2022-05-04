package com.clase21.controller.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.clase21.model.Client;

@Repository
public interface cRepository extends JpaRepository<Client, Long> {
	@Query(
			value = "SELECT * FROM clients  WHERE clients.name LIKE %:filtro% ",
			nativeQuery = true
			)
	List<Client> searchClient(@Param("filtro")String filtro);
	
	
	@Query(
			value = "SELECT * FROM clients ",
			nativeQuery = true
			)
	List<Client> findAllQuery();
	
}
