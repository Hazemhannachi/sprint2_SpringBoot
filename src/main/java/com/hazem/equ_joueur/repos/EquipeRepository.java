package com.hazem.equ_joueur.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hazem.equ_joueur.entities.Equipe;

@RepositoryRestResource(path = "rest")
public interface EquipeRepository  extends JpaRepository<Equipe, Long>{
	
	
	List<Equipe> findByNomEquipe(String nomEquipe);
}
