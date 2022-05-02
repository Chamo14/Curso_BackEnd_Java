package com.clase18.controller.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clase18.controller.Repository.cRepository;
import com.clase18.model.Client;

@Service
public class cService {
	@Autowired
	private cRepository CRepo;
	
	
	//POST CLIENT
	public void saveClient(Client client) {
		if(CRepo.findById(client.getId()) != null)return;
		CRepo.save(client);
	};
	
	
	//GET ONE CLIENT
	public Client getOne(Long id) {
		if(!CRepo.existsById(id)) return null;
		return CRepo.findById(id).get();
	}
	
	//GET ALL CLIENTS
	public List<Client> getAllClients(){
		return (List<Client>) CRepo.findAll();
	}
	
	//UPDATE CLIENT
	public void update(Client client) {
		if(!CRepo.existsById(client.getId())) return;
		CRepo.save(client);
	}
	//DELETE CLIENT
	
	public void deleteClient(Long id) {
		if(!CRepo.existsById(id)) return;
		CRepo.deleteById(id);
		
		
	}
	
	
	

	public cRepository getCRepo() {
		return CRepo;
	}

	public void setCRepo(cRepository cRepo) {
		CRepo = cRepo;
	}
	
	
	
}	
	
	


