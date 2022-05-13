package com.clase27.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.clase27.entity.Cliente;
import com.clase27.reports.ReporteVenta;
import com.clase27.service.ClienteService;



@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService cService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> listar(){
		return ResponseEntity.ok().body(cService.findAll());
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<Cliente>> findOne(@PathVariable Long id){
		return ResponseEntity.ok().body(cService.findById(id));
	}


	@PutMapping("/update")
	public ResponseEntity<Cliente> update(@RequestBody Cliente Cliente){
		return ResponseEntity.ok().body(cService.save(Cliente));
	}


	@PostMapping("/save")
	public ResponseEntity<Cliente> save(@RequestBody Cliente Cliente){
		return ResponseEntity.ok().body(cService.save(Cliente));
	}


	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		if(cService.delete(id)) {
			cService.delete(id);
			return ResponseEntity.ok().body("Cliente eliminado");
		}
		return ResponseEntity.notFound().build();
	}
	

}
