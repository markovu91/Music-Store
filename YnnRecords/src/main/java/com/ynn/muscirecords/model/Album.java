package com.ynn.muscirecords.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="album")
public class Album implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int albumId;
	
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
	
	@ManyToOne
	private Artist artist;
	
	public Album() {}
	
	
	
	

}
