package com.solidaires.server.entity;




import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Joueur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private Long dossard;
	@Embedded
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name = "id_club")
	private Club club;
	private Long matchJouer;
	private Long but;
	private Long passeDecisives;
	private float ratioBut;
	private float ratioPasseDecisives;
	
	
	public Joueur() {
		// TODO Auto-generated constructor stub
	}
	public Joueur(String nom, Long dossard,Club club,Long matchJouer, Long but, Long passeDecisives, float ratioBut, float ratioPasseDecisives) {
		super();
		this.nom = nom;
		this.dossard = dossard;
		this.club = club;
		this.matchJouer = matchJouer;
		this.but = but;
		this.passeDecisives = passeDecisives;
		this.ratioBut =  ratioBut;
		this.ratioPasseDecisives = ratioPasseDecisives;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getDossard() {
		return dossard;
	}
	public void setDossard(Long dossard) {
		this.dossard = dossard;
	}
	
	public Club getClub() {
		return club;
	}
	
	public void setClub(Club club) {
		this.club = club;
	}
	public Long getMatchJouer() {
		return matchJouer;
	}
	public void setMatchJouer(Long matchJouer) {
		this.matchJouer = matchJouer;
	}
	public Long getBut() {
		return but;
	}
	public void setBut(Long but) {
		this.but = but;
	}
	public Long getPasseDecisives() {
		
		return passeDecisives;
	}
	public void setPasseDecisives(Long passeDecisives) {
		this.passeDecisives = passeDecisives;
	}
	public float getRatioBut() {
		ratioBut = Math.round(((float) but / (float) matchJouer) * 100f)/100f ; 
		return ratioBut;
	}
	public void setRatioBut(float ratioBut) {
		this.ratioBut = ratioBut;
	}
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", nom=" + nom + ", dossard=" + dossard + ", matchJouer=" + matchJouer + ", but="
				+ but + ", passeDecisives=" + passeDecisives + ", ratioBut=" + ratioBut + ", ratioPasseDecisives="
				+ ratioPasseDecisives + "]";
	}
	public float getRatioPasseDecisives() {
		ratioPasseDecisives = Math.round(((float) passeDecisives / (float) matchJouer) * 100f)/100f ; 
		return ratioPasseDecisives;
	}
	public void setRatioPasseDecisives(float ratioPasseDecisives) {
		this.ratioPasseDecisives = ratioPasseDecisives;
	}
	

}

