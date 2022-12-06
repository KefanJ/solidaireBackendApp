package com.solidaires.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solidaires.server.entity.Club;

@Repository
public interface IClubRepository extends JpaRepository<Club, Long> {
	
}
