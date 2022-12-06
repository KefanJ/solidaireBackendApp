package com.solidaires.server.service;

import java.util.List;

import com.solidaires.server.entity.Club;

public interface IClubService {
	public List<Club> getClubs();
	public Club saveClub(Club club);
	public void deleteClub(Long id);
	public Club getClubById(Long id);
	
	

}
