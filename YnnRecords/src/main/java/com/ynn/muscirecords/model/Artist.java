package com.ynn.muscirecords.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class Artist implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_artist;
	
	@Column(name="artist_name")
	private String artistName;
	@Column(name="artist_description")
	private String artistDescription;
	@Column(name="artist_formation_year")
	private int artistFormationYear;
	
	
	public Artist() {}

	
	
	public int getId_artist() {
		return id_artist;
	}

	public void setId_artist(int id_artist) {
		this.id_artist = id_artist;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistDescription() {
		return artistDescription;
	}

	public void setArtistDescription(String artistDescription) {
		this.artistDescription = artistDescription;
	}

	public int getArtistFormationYear() {
		return artistFormationYear;
	}

	public void setArtistFormationYear(int artistFormationYear) {
		this.artistFormationYear = artistFormationYear;
	}
	
	
	
	

}
