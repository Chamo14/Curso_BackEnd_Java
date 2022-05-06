package com.clase23.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.clase23.model.Persona;

@org.springframework.stereotype.Controller
public class Controller {
	//GUARDADO DE URL DE LA API
	private final String PERSONAS="http://localhost:8080/apiPersona/";
	
	//MUESTRA TODAS LAS PERSONAS A TRAVES DE LA API
	@SuppressWarnings("unchecked")
	@GetMapping("/mostrarLista")
	public String mostrarLista(Model model) {
		String url= "http://localhost:8080/apiPersona/listar";
		RestTemplate resTemplate=new RestTemplate();
		List<Persona> personas = new ArrayList<Persona>();
		personas= resTemplate.getForObject(url, ArrayList.class);
		model.addAttribute("personas",personas);
		return "listaPersonas";
	}
	
	@GetMapping("/crearPersona")
	public String crearPersona(Model model)
	{
		Persona persona = new Persona();
		model.addAttribute("persona", persona);
		
		return "personaForm"; 
	}
	
	//CREA UNA PERSONA A TRAVES DE LA API
	@PostMapping("/crearPersona")
	public String crearPersona(@ModelAttribute ("persona") Persona persona,Model model)
	{
		String url="http://localhost:8080/apiPersona/";
		RestTemplate resTemplate=new RestTemplate();
		resTemplate.postForObject(url, persona, Persona.class);
		System.out.println("se cargo");
		return "redirect:/mostrarLista";
	}
	
	//EDITAR PERSONA
	
	@GetMapping("/crearPersona/{id}")
	public String editarPersona(@PathVariable Long id,Model model)
	{
		Persona persona = null;
		if(id>0) {
			String url= PERSONAS+id;
			RestTemplate resTemplate=new RestTemplate();
			resTemplate.put(url, persona);
			model.addAttribute("persona",persona);
			
		}else
		{
			return "redirect:/mostrarLista";
		}
		return "personaForm"; 
	}
	
	//ELIMINA UNA PERSONA A TRAVES DE LA API
	@GetMapping("/eliminarPersona/{id}")
	public String eliminarPersona(@PathVariable  Long id, Model model)
	{
		RestTemplate resTemplate=new RestTemplate();
		resTemplate.delete(PERSONAS+id);
		return "redirect:/mostrarLista";
	}
	
}
