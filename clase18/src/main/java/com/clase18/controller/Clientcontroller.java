package com.clase18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clase18.controller.Service.cService;
import com.clase18.model.Client;

@Controller
@RequestMapping("/clientes")
public class Clientcontroller {
	
	@Autowired
	cService cService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/clientForm")
	public String clientForm(Model model) {
		model.addAttribute("clientForm",new Client());
		model.addAttribute("clientList",cService.getAllClients());
		return "client-form";
	}
	
	
	@GetMapping("/create")
	public String showClient(Model model) {
		Client client=new Client();
		model.addAttribute("clientForm",client);
		return "client-form";
	}
	@PostMapping("/create")
	public String createClient(@ModelAttribute("clientForm") Client client) {
		cService.saveClient(client);
		return "redirect:/clientes";
	}
	

}
