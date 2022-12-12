package com.solidaires.server.service;

import java.util.List;

import com.solidaires.server.entity.Joueur;



public interface IJoueurService {
	public List<Joueur> getJoueurs();
	public Joueur saveJoueur(Joueur joueur);
	public Joueur updateJoueur(Joueur joueur);
	public void deleteJoueur(Long id);
	public Joueur getJoueurById(Long id);
	//public Club getClubByNom(String name);
	
	

}
