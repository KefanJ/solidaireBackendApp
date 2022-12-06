package com.solidaires.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.solidaires.server.entity.Club;
import com.solidaires.server.service.ClubService;

@RestController
@RequestMapping("/clubs")
public class RestClubController {
	
	@Autowired
	ClubService service;
	
	@GetMapping
	public List<Club> getClubs() {
		return service.getClubs();
		
	}
	
	
	@PostMapping
	public Club createClub(@RequestBody Club club) {
		return service.addClub(club);
	}
}
