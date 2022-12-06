package com.solidaires.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solidaires.server.entity.Club;
import com.solidaires.server.repository.IClubRepository;

@Service
public class ClubService implements IClubService {

	@Autowired
	IClubRepository clubRepository;
	@Override
	public List<Club> getClubs() {
		// TODO Auto-generated method stub
		return clubRepository.findAll();
	}
	@Override
	public Club addClub(Club club) {
		// TODO Auto-generated method stub
		return clubRepository.save(club);
	}

}
