package com.clase27.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase27.entity.Venta;
import com.clase27.repository.IVentaRepo;

@Service
public class VentaService {
	@Autowired
	private IVentaRepo vRepo;
	
	//Listar
	public List<Venta> findAll(){
		return vRepo.findAll();
	}
	//Devolver una venta
	
	public Optional<Venta> findById(Long id){
		if(vRepo.existsById(id)) {
			return vRepo.findById(id);
		}
		return null;
	}
	
	//Crear venta 
	public Venta save(Venta venta) {
		return vRepo.save(venta);
	}
	
	public List<Venta> listarPorCliente(long id){
		return vRepo.listarPorCliente(id);
	}
}
