package com.solidaires.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solidaires.server.entity.Joueur;
import com.solidaires.server.service.JoueurService;

@RestController
@RequestMapping("/joueurs")
public class RestJoueurController {
	
	@Autowired
	JoueurService service;
	
	@GetMapping
	public List<Joueur> getJoueur() {
		return service.getJoueurs();	
	}
	
	@GetMapping("/{id}")
	public Joueur getJoueurById(@PathVariable("id") Long id){
		return service.getJoueurById(id);
	}
	
	@PostMapping
	public Joueur createJoueur(@RequestBody Joueur joueur) {
		return service.saveJoueur(joueur);
	}
	
	@PutMapping
	public Joueur updateJoueur (@RequestBody Joueur joueur) {
		return service.saveJoueur(joueur);
	}
	
	@DeleteMapping("/{id}")
	public void deleteJoueur(@PathVariable("id") Long id) {
		service.deleteJoueur(id);
	}
	
	
}
