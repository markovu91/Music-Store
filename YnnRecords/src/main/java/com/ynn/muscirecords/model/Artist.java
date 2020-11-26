package com.ynn.muscirecords.model;

import java.io.Serializable;


public class Artist implements Serializable {

	private int artistId;
	private String artistName;
	private String artistDescription;
	private int artistFormationYear;
	
	
	public Artist() {}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
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
