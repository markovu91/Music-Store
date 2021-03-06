package com.ynn.muscirecords.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_genre")
	private int idGenre;

	
	@Column(name = "genre_name")
	private String genreName;
	
	@OneToMany(mappedBy = "genre")
	private List<Artist> artists;
	
	
	
	public Genre() {}


	

	public int getIdGenre() {
		return idGenre;
	}




	public void setIdGenre(int idGenre) {
		this.idGenre = idGenre;
	}




	public String getGenreName() {
		return genreName;
	}


	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}


//	public List<Artist> getArtists() {
//		return artists;
//	}
//
//
//	public void setArtists(List<Artist> artists) {
//		this.artists = artists;
//	}


//	@Override
//	public String toString() {
//		return "Genre [id_genre=" + id_genre + ", genreName=" + genreName + ", artists=" + artists + "]";
//	}
	
	
	

}
