package com.ynn.muscirecords.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="album")
public class Album implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_album")
	private int idAlbum;
	
	@Column(name = "album_title")
	private String albumTitle;
	
	@Column(name="album_release_year")
	private int albumReleaseYear;
	
	@Column(name="album_cover_art")
	private String albumCoverArt;
	
	@Column(name="album_price")
	private double albumPrice;
	
	@Column(name="album_catalog_number")
	private String albumCatalogNumber;
	
	@Column(name = "album_edition")
	private String albumEdition;
	
	@Column(name="album_quantity")
	private int albumQuantity;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_artist")
	private Artist artist;
	
	@OneToMany(mappedBy = "album")
	private List<Track> tracks;
	
	
	public Album() {}




	public int getIdAlbum() {
		return idAlbum;
	}




	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}




	public String getAlbumTitle() {
		return albumTitle;
	}


	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}


	public int getAlbumReleaseYear() {
		return albumReleaseYear;
	}


	public void setAlbumReleaseYear(int albumReleaseYear) {
		this.albumReleaseYear = albumReleaseYear;
	}


	public String getAlbumCoverArt() {
		return albumCoverArt;
	}


	public void setAlbumCoverArt(String albumCoverArt) {
		this.albumCoverArt = albumCoverArt;
	}


	public double getAlbumPrice() {
		return albumPrice;
	}


	public void setAlbumPrice(double albumPrice) {
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


	public int getAlbumQuantity() {
		return albumQuantity;
	}


	public void setAlbumQuantity(int albumQuantity) {
		this.albumQuantity = albumQuantity;
	}


	public Artist getArtist() {
		return artist;
	}


	public void setArtist(Artist artist) {
		this.artist = artist;
	}




	public List<Track> getTracks() {
		return tracks;
	}


	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}


	@Override
	public String toString() {
		return "Album [id_album=" + idAlbum + ", albumTitle=" + albumTitle + ", albumReleaseYear=" + albumReleaseYear
				+ ", albumCoverArt=" + albumCoverArt + ", albumPrice=" + albumPrice + ", albumCatalogNumber="
				+ albumCatalogNumber + ", albumEdition=" + albumEdition + ", albumQuantity=" + albumQuantity
				+ ", artist=" + artist + ", tracks=" + tracks + "]";
	}

	
	




	

	
	
	
	
	
	

}
