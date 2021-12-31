package com.hazem.equ_joueur.entities;


import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Equipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEquipe;
	private String nomEquipe;
	private String descriptionEquipe;
	
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="equipe")
	@JsonIgnore
	private List<Joueur> joueurs;



	public Equipe() {
		super();
	}



	public Equipe(Long idEquipe, String nomEquipe, String descriptionEquipe, List<Joueur> joueurs) {
		super();
		this.idEquipe = idEquipe;
		this.nomEquipe = nomEquipe;
		this.descriptionEquipe = descriptionEquipe;
		this.joueurs = joueurs;
	}



	public Long getIdEquipe() {
		return idEquipe;
	}



	public void setIdEquipe(Long idEquipe) {
		this.idEquipe = idEquipe;
	}



	public String getNomEquipe() {
		return nomEquipe;
	}



	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}



	public String getDescriptionEquipe() {
		return descriptionEquipe;
	}



	public void setDescriptionEquipe(String descriptionEquipe) {
		this.descriptionEquipe = descriptionEquipe;
	}



	public List<Joueur> getJoueurs() {
		return joueurs;
	}



	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}

	
		

	
}
