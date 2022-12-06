package com.solidaires.server.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Club {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long nbrVictoireTotal;
	private Long nbrNulTotal;
	private Long nbrDefaiteTotal;
	private Long nbrButMarquer;
	private Long nbrButPris;
	
	
	public Club() {
		// TODO Auto-generated constructor stub
	}


	public Club(String name, Long nbrVictoireTotal, Long nbrNulTotal, Long nbrDefaiteTotal, Long nbrButMarquer,
			Long nbrButPris) {
		super();
		this.name = name;
		this.nbrVictoireTotal = nbrVictoireTotal;
		this.nbrNulTotal = nbrNulTotal;
		this.nbrDefaiteTotal = nbrDefaiteTotal;
		this.nbrButMarquer = nbrButMarquer;
		this.nbrButPris = nbrButPris;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Long getNbrVictoireTotal() {
		return nbrVictoireTotal;
	}


	public void setNbrVictoireTotal(Long nbrVictoireTotal) {
		this.nbrVictoireTotal = nbrVictoireTotal;
	}


	public Long getNbrNulTotal() {
		return nbrNulTotal;
	}


	public void setNbrNulTotal(Long nbrNulTotal) {
		this.nbrNulTotal = nbrNulTotal;
	}


	public Long getNbrDefaiteTotal() {
		return nbrDefaiteTotal;
	}


	public void setNbrDefaiteTotal(Long nbrDefaiteTotal) {
		this.nbrDefaiteTotal = nbrDefaiteTotal;
	}


	public Long getNbrButMarquer() {
		return nbrButMarquer;
	}


	public void setNbrButMarquer(Long nbrButMarquer) {
		this.nbrButMarquer = nbrButMarquer;
	}


	public Long getNbrButPris() {
		return nbrButPris;
	}


	public void setNbrButPris(Long nbrButPris) {
		this.nbrButPris = nbrButPris;
	}


	@Override
	public String toString() {
		return "Club [id=" + id + ", name=" + name + ", nbrVictoireTotal=" + nbrVictoireTotal + ", nbrNulTotal="
				+ nbrNulTotal + ", nbrDefaiteTotal=" + nbrDefaiteTotal + ", nbrButMarquer=" + nbrButMarquer
				+ ", nbrButPris=" + nbrButPris + "]";
	}

	
}
