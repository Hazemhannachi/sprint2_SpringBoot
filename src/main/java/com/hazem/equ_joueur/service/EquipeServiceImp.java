package com.hazem.equ_joueur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.repos.EquipeRepository;


@Service
public class EquipeServiceImp implements EquipeService {
	
	@Autowired
	EquipeRepository equipeRepository;
	
	public List<Equipe> getAllEquipe() {
		
		return equipeRepository.findAll();
	}

	public Equipe getEquipeById(Long id) {
		return equipeRepository.getById(id);
	}
	
	public List<Equipe> getEquipeByName(String name) {
		return equipeRepository.findByNomEquipe(name);
	}
	
	

	

}
