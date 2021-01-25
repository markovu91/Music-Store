package com.ynn.muscirecords.model.DTO;

import java.io.Serializable;

public class ArtistDTO implements Serializable {
	
	private Integer idArtist;
	private String artistName;
	private String artistDescription;
	private String artistFormationYear;
	private String genreName;
	
	public ArtistDTO() {
		
	}
	
	
	
	
	public Integer getIdArtist() {
		return idArtist;
	}
	public void setIdArtist(Integer idArtist) {
		this.idArtist = idArtist;
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
	
	public String getArtistFormationYear() {
		return artistFormationYear;
	}

	public void setArtistFormationYear(String artistFormationYear) {
		this.artistFormationYear = artistFormationYear;
	}

	public String getGenreName() {
		return genreName;
	}

	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}

	
	
	
	
	

}
