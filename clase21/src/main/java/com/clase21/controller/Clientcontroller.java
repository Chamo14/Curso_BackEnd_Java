package com.clase21.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clase21.controller.Service.cService;
import com.clase21.model.Client;


@Controller
@RequestMapping("/clientes")
public class Clientcontroller {
	
	@Autowired
	cService cService;
	
	@GetMapping("/clientForm")
	public String clientForm(Model model) {
		model.addAttribute("clientForm",new Client());
		//model.addAttribute("clientList",cService.getAllClients());
		model.addAttribute("clientList",cService.getAllClientsQuery());
		model.addAttribute("listTab","active");
		return "client-view";
	}
	
	
	@GetMapping("/create")
	public String showClient(Model model) {
		model.addAttribute("clientForm",new Client());
		model.addAttribute("listForm","active");
		return "redirect:clientForm";
	}
	@PostMapping("/create")
	public String createClient(@ModelAttribute("clientForm") Client client) {
		cService.saveClient(client);
		return "redirect:clientForm";
	}
	
	@GetMapping("/editClient/{id}")
	public String editClient(@PathVariable(name ="id") long id, Model model) {
		Client client= cService.getOne(id);
		model.addAttribute("clientForm",client);
		//model.addAttribute("clientList",cService.getAllClients());
		model.addAttribute("clientList",cService.getAllClientsQuery());
		model.addAttribute("formTab","active");
        return "client-view";
    }
	
	@PostMapping("/editClient/{id}")
	public String editClient(@ModelAttribute("clientForm") Client client, @PathVariable(name="id") Long id) {
		cService.update(client, id);
		return "redirect:clientForm";
	}
	
	@GetMapping("/editClient/cancel")
	public String cancelClient(Model model) {
		return "redirect:/clientes";
	}
	
	@GetMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable ("id") Long id) {
		cService.deleteClient(id);
		
		return "redirect:/clientes/clientForm";
	}
	
	@GetMapping("/busquedaQuery/{name}")
	public String busquedaQuery(@PathVariable ("name") String name,Model model)
	{
		model.addAttribute("clientForm",new Client());
		
		model.addAttribute("clientList",cService.getByNameQuery(name));
		model.addAttribute("listTab","active");
		return "client-view";
	}

}
