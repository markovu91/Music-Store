package com.ynn.muscirecords.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "track")
public class Track implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="track_id")
	private int trackId;
	
	@Column(name="track_number")
	private int trackNumber;
	
	@Column(name="track_title")
	private String trackTitle;
	
	@Column(name="track_price")
	private double trackPrice;
	
	@ManyToOne
	@JoinColumn(name = "id_album")
	private Album album;


	
	public Track() {
		super();
	}

	public Track(int trackId, int trackNumber, String trackTitle, double trackPrice, Album album) {
		super();
		this.trackId = trackId;
		this.trackNumber = trackNumber;
		this.trackTitle = trackTitle;
		this.trackPrice = trackPrice;
		this.album = album;
	}

	public int getTrackId() {
		return trackId;
	}

	public void setTrackId(int trackId) {
		this.trackId = trackId;
	}

	public int getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}

	public String getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

	public double getTrackPrice() {
		return trackPrice;
	}

	public void setTrackPrice(double trackPrice) {
		this.trackPrice = trackPrice;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Track [trackId=" + trackId + ", trackNumber=" + trackNumber + ", trackTitle=" + trackTitle
				+ ", trackPrice=" + trackPrice + ", album=" + album + "]";
	}
	
	
	
}
