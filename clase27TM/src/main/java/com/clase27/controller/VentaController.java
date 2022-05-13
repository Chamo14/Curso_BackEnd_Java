package com.clase27.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clase27.entity.Venta;
import com.clase27.reports.ReporteVenta;
import com.clase27.service.VentaService;


@RestController
@RequestMapping("/api/ventas")
public class VentaController {
	
	@Autowired
	private VentaService vService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Venta>> listar(){
		return ResponseEntity.ok().body(vService.findAll());
	}
	
	@GetMapping("/listar/{id}")
	public ResponseEntity<Optional<Venta>> unaVenta(@PathVariable Long id){
		return ResponseEntity.ok().body(vService.findById(id));
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Venta> save(@RequestBody Venta venta){
		return ResponseEntity.ok().body(vService.save(venta));
	}

	@GetMapping("/listarCliente/{id}")
	public ResponseEntity<List<Venta>> getVentaByCliente(@PathVariable long id){
		return ResponseEntity.ok().body(vService.listarPorCliente(id));
	}
	@GetMapping("/excel")
	public void writeExcelFile(HttpServletResponse response) throws IOException {
		response.setContentType("application/octet-stream");
		response.setHeader("Content-Disposition", "attachment;filename=listado-ventas.xlsx");
		List<Venta> ventas = vService.findAll();
		ReporteVenta excel = new ReporteVenta(ventas);
		excel.crearXcel(response);
		
	}
}
