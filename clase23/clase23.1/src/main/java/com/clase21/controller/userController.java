package com.clase21.controller;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/clientes")
public class userController {
	@GetMapping
	public List<Object> obtenerUsuarios()
	{
		String url="http://localhost:8081/api/users/listUsers";
		RestTemplate template=new RestTemplate();
		Object[] usuarios = template.getForObject(url,Object[].class);
		return Arrays.asList(usuarios);
	}
	
	@GetMapping("/listarUsuarios")
	public String mostrarUsuarios (Model model)
	{

		model.addAttribute("userList",obtenerUsuarios());
		return "usuarios";
	}
	
	

}
