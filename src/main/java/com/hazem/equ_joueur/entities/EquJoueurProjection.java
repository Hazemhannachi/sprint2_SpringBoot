package com.hazem.equ_joueur.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomJoueur", types = { Joueur.class })
public interface EquJoueurProjection {
	
	public String getNomJoueur();
}
