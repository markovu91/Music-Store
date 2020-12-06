package com.ynn.muscirecords.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="artist")
public class Artist implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_artist")
	private int id_artist;
	
	@Column(name="artist_name")
	private String artistName;
	
	@Column(name="artist_description")
	private String artistDescription;
	
	@Column(name="artist_formation_year")
	private int artistFormationYear;
	
	@OneToMany(mappedBy = "artist")
	private List<Album> albums;
	
//	@ManyToOne
//	@JoinColumn(name = "id_genre")
//	private Genre genre;
	
	
	public Artist() {}

	
	
	
//	public Artist(int id_artist, String artistName, String artistDescription, int artistFormationYear,
//			List<Album> albums, Genre genre) {
//		super();
//		this.id_artist = id_artist;
//		this.artistName = artistName;
//		this.artistDescription = artistDescription;
//		this.artistFormationYear = artistFormationYear;
//		this.albums = albums;
//		this.genre = genre;
//	}




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



	public List<Album> getAlbums() {
		return albums;
	}



	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}



//	public Genre getGenre() {
//		return genre;
//	}
//
//
//
//	public void setGenre(Genre genre) {
//		this.genre = genre;
//	}
//



//	@Override
//	public String toString() {
//		return "Artist [id_artist=" + id_artist + ", artistName=" + artistName + ", artistDescription="
//				+ artistDescription + ", artistFormationYear=" + artistFormationYear + ", albums=" + albums + ", genre="
//				+ genre + "]";
//	}
	
	
	
	

}
