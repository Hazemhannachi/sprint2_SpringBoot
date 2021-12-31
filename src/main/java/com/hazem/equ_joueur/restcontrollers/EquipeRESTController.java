package com.hazem.equ_joueur.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.service.EquipeServiceImp;



@RestController
@CrossOrigin("*")
@RequestMapping("/equipes")
public class EquipeRESTController {

	@Autowired
	EquipeServiceImp equipeService;
	
	@RequestMapping(path="",method = RequestMethod.GET)
	public List<Equipe> getAllEquipes(){
		return equipeService.getAllEquipe();
		
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Equipe getEquipeById(@PathVariable("id") Long id) {
		return equipeService.getEquipeById(id);

	}
	

}
