package com.hazem.equ_joueur.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazem.equ_joueur.entities.Equipe;
import com.hazem.equ_joueur.entities.Joueur;
import com.hazem.equ_joueur.repos.EquJoueurRepository;
import com.hazem.equ_joueur.repos.EquipeRepository;

@Service
public class JoueurServiceImp implements JoueurService {

	@Autowired
	EquJoueurRepository equJoueurRepository;

	@Autowired
	EquipeRepository equipeRepository;
	
	
	public Joueur saveJoueur(Joueur p) {
			//p.setEquipe(equipeRepository.getById(p.getEquipe().getIdEquipe()));
		return equJoueurRepository.save(p);
	}

	@Override
	public Joueur updateJoueur(Joueur p) {
		return equJoueurRepository.save(p);
	}

	@Override
	public void deleteJoueur(Joueur p) {
		equJoueurRepository.delete(p);
	}

	@Override
	public void deleteJoueurById(Long id) {
		equJoueurRepository.deleteById(id);
	}

	@Override
	public Joueur getJoueur(Long id) {
		return equJoueurRepository.findById(id).get();
	}

	@Override
	public List<Joueur> getAllJoueurs() {
		return equJoueurRepository.findAll();
	}
	@Override
	public List<Joueur> findByNomJoueur(String nom) {
	return equJoueurRepository.findByNomJoueur(nom);
	}
	@Override
	public List<Joueur> findByNomJoueurContains(String nom) {
	return equJoueurRepository.findByNomJoueurContains(nom);
	}
	@Override
	public List<Joueur> findByNomNumero(String nom, int num) {
	return equJoueurRepository.findByNomNumero(nom, num);
	}
	@Override
	public List<Joueur> findByEquipe(Equipe equipe) {
	return equJoueurRepository.findByEquipe(equipe);
	}
	@Override
	public List<Joueur> findByEquipeIdEquipe(Long id) {
	return equJoueurRepository.findByEquipeIdEquipe(id);
	}
	@Override
	public List<Joueur> findByOrderByNomJoueurAsc() {
	return equJoueurRepository.findByOrderByNomJoueurAsc();
	}
	@Override
	public List<Joueur> trierJoueursNomsNumero() {
	return equJoueurRepository.trierJoueursNomsNumero();
	}
}
