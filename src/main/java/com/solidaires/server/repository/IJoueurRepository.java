package com.solidaires.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solidaires.server.entity.Joueur;

@Repository
public interface IJoueurRepository extends JpaRepository<Joueur, Long> {
	
}
