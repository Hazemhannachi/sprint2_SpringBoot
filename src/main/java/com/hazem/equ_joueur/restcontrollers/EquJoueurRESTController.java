package com.hazem.equ_joueur.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hazem.equ_joueur.entities.Joueur;
import com.hazem.equ_joueur.service.JoueurService;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class EquJoueurRESTController {

	@Autowired
	JoueurService joueurService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Joueur> getAllJoueurs() {
		return joueurService.getAllJoueurs();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Joueur getJoueur(@PathVariable("id") Long id) {
		return joueurService.getJoueur(id);
	 }
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Joueur ajoutJoueur(@RequestBody Joueur joueur) {
	return joueurService.saveJoueur(joueur);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Joueur updateJoueur(@RequestBody Joueur joueur) {
	return joueurService.updateJoueur(joueur);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteJoueurById(@PathVariable("id") Long id)
	{
		joueurService.deleteJoueurById(id);
	}

	@RequestMapping(value="/prodscat/{id}",method = RequestMethod.GET)
	public List<Joueur> findByEquipeIdEquipe(@PathVariable("id") Long id) {
	return joueurService.findByEquipeIdEquipe(id);
	}
	
	@RequestMapping(value="/equipeJoueur/{idEquipe}",method = RequestMethod.GET)
	public List<Joueur> getjoueurByEquipe(@PathVariable("idEquipe") Long idEquipe) {
		return joueurService.findByEquipeIdEquipe(idEquipe);
	
	}
}
