package com.clase27.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clase27.entity.Producto;
import com.clase27.repository.IProductoRepo;

@Service
public class ProductoService {
	@Autowired
	private IProductoRepo pRepo;
	
	//Listar productos
	public List<Producto> findAll(){
		return pRepo.findAll();
	}
	//Retornar un producto
	public Optional<Producto> findById(Long id){
		if(pRepo.existsById(id)) {
			return pRepo.findById(id);
		}
		return null;
	}
	//Crear producto
	public Producto save(Producto producto) {
		return pRepo.save(producto);
	}
	//Editar producto
	public Producto update(Producto producto) {
		if(pRepo.existsById(producto.getCodigoProducto())){
			return pRepo.save(producto);
		}
		return null;
	}
	//Eliminar producto
	public boolean delete(Long id) {
		if(pRepo.existsById(id)) {
			pRepo.deleteById(id);
			return true;
		}
		return false;
	}
}
