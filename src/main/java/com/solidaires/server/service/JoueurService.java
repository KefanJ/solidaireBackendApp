package com.solidaires.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solidaires.server.entity.Club;
import com.solidaires.server.entity.Joueur;
import com.solidaires.server.repository.IJoueurRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Service
public class JoueurService implements IJoueurService {

	@Autowired
	IJoueurRepository joueurRepository;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Joueur> getJoueurs() {
		// TODO Auto-generated method stub
		return joueurRepository.findAll();
	}

	@Override
	public Joueur saveJoueur(Joueur joueur) {
		// TODO Auto-generated method stub
		
	
		
		try {
			if(joueur.getId() == null) {
				joueur.getClub().getJoueurs().add(joueur);
				Club club = em.find(Club.class, joueur.getClub().getId());
				em.detach(joueur);
				joueur.setClub(club);
				em.getTransaction().commit();
				joueurRepository.save(joueur);
			}
			else {
				joueur.setNom(joueur.getNom());
				joueur.setDossard(joueur.getDossard());
				joueur.setClub(joueur.getClub());
				joueur.setMatchJouer(joueur.getMatchJouer());
				joueur.setBut(joueur.getBut());
				joueur.setPasseDecisives(joueur.getPasseDecisives());
				joueur.setRatioBut(joueur.getRatioBut());
				joueur.setRatioPasseDecisives(joueur.getRatioPasseDecisives());
				joueurRepository.save(joueur);
				
			}
		
			
		} catch (Exception e) {
		if( joueur.getBut() > joueur.getClub().getNbrButMarquer()) {
			System.err.println("ERREUR : Le nombre de but du joueur est supérieur à celui du club ! ");
		}
		}
		

		
	
	
		return joueur;
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
