package com.ynn.muscirecords.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genre")
public class Genre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_genre;
	
	@Column(name = "genre_name")
	private String genreName;
	
	
	public Genre() {}


	public int getId_genre() {
		return id_genre;
	}


	public void setId_genre(int id_genre) {
		this.id_genre = id_genre;
	}


	public String getGenreName() {
		return genreName;
	}


	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	
	

}
