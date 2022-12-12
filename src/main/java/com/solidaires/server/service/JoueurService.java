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
	
	@Autowired
	ClubService clubService;
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Joueur> getJoueurs() {
		// TODO Auto-generated method stub
		return joueurRepository.findAll();
	}

	@Override
	public Joueur saveJoueur(Joueur joueur ) {
		// TODO Auto-generated method stub
		
	
		
		//Club club = em.find(Club.class, joueur.getClub().getId());
		Club club = clubService.getClubById(joueur.getClub().getId());
		
		
	
			if(joueur.getId() == null ) {
				
				
				if( joueur.getBut() > club.getNbrButMarquer()) {
					System.err.println("ERREUR : Le nombre de but du joueur est supérieur à celui du club ! ");
				}
				else {
					
					joueur.getClub().getJoueurs().add(joueur);
					joueur.setClub(club);
					//em.detach(joueur);
					//em.getTransaction().commit();
					joueurRepository.save(joueur);
				}

				//joueur.getClub().getJoueurs().add(joueur);
				
			}
		//System.out.println(club);
		
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

	@Override
	public Joueur updateJoueur(Joueur joueur) {
		Club club = clubService.getClubById(joueur.getClub().getId());
		
		
		if(joueur.getId() != null) {
			joueur.setNom(joueur.getNom());
			joueur.setDossard(joueur.getDossard());
			//joueur.setClub(club);
			club.setId(joueur.getClub().getId());
			joueur.setMatchJouer(joueur.getMatchJouer());
			joueur.setBut(joueur.getBut());
			joueur.setPasseDecisives(joueur.getPasseDecisives());
			joueur.setRatioBut(joueur.getRatioBut());
			joueur.setRatioPasseDecisives(joueur.getRatioPasseDecisives());
			
			
				//club.setId(joueur.getClub().getId());
				
				//joueur.getClub().getJoueurs().add(joueur);
				
			
		}
		// TODO Auto-generated method stub

		System.out.println("Club Id : "+club.getId());
		System.out.println("Joueur club id : "+ joueur.getClub().getId());
		return joueurRepository.save(joueur);
	}


	
	
 



}
