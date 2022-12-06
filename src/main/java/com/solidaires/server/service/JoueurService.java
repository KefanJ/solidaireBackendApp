package com.solidaires.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solidaires.server.entity.Joueur;
import com.solidaires.server.repository.IJoueurRepository;

@Service
public class JoueurService implements IJoueurService {

	@Autowired
	IJoueurRepository joueurRepository;

	@Override
	public List<Joueur> getJoueurs() {
		// TODO Auto-generated method stub
		return joueurRepository.findAll();
	}

	@Override
	public Joueur saveJoueur(Joueur joueur) {
		// TODO Auto-generated method stub
		return joueurRepository.save(joueur);
	}

	@Override
	public void deleteJoueur(Long id) {
		// TODO Auto-generated method stub
		joueurRepository.deleteById(id);
	}

	@Override
	public Joueur getJoueurById(Long id) {
		// TODO Auto-generated method stub
		return joueurRepository.findById(id).get();
	}


	
	
 



}
