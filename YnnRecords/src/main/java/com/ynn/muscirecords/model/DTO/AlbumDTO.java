package com.ynn.muscirecords.model.DTO;

import java.io.Serializable;

public class AlbumDTO implements Serializable{
	
	private Integer albumId;
	private String albumTitle;
	private String albumReleaseYear;
	private String albumCoverArt;
	private String albumPrice;
	private String albumCatalogNumber;
	private String albumEdition;
	private String albumQuantity;
	private String artistName;
	
	
	public AlbumDTO() {}
	
	public Integer getAlbumId() {
		return albumId;
	}
	public void setAlbumId(Integer albumId) {
		this.albumId = albumId;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public String getAlbumReleaseYear() {
		return albumReleaseYear;
	}
	public void setAlbumReleaseYear(String albumReleaseYear) {
		this.albumReleaseYear = albumReleaseYear;
	}
	public String getAlbumCoverArt() {
		return albumCoverArt;
	}
	public void setAlbumCoverArt(String albumCoverArt) {
		this.albumCoverArt = albumCoverArt;
	}
	public String getAlbumPrice() {
		return albumPrice;
	}
	public void setAlbumPrice(String albumPrice) {
		this.albumPrice = albumPrice;
	}
	public String getAlbumCatalogNumber() {
		return albumCatalogNumber;
	}
	public void setAlbumCatalogNumber(String albumCatalogNumber) {
		this.albumCatalogNumber = albumCatalogNumber;
	}
	public String getAlbumEdition() {
		return albumEdition;
	}
	public void setAlbumEdition(String albumEdition) {
		this.albumEdition = albumEdition;
	}
	public String getAlbumQuantity() {
		return albumQuantity;
	}
	public void setAlbumQuantity(String albumQuantity) {
		this.albumQuantity = albumQuantity;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	
	
	

}
