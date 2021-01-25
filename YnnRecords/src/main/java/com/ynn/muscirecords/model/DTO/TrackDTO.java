package com.ynn.muscirecords.model.DTO;

public class TrackDTO {
	
	private Integer idTrack;
	private String trackTitle;
	private String trackNumber;
	private String trackPrice;
	private String albumTitle;
	
	public TrackDTO() {
		
	}

	public Integer getIdTrack() {
		return idTrack;
	}

	public void setIdTrack(Integer idTrack) {
		this.idTrack = idTrack;
	}

	public String getTrackTitle() {
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}

	public String getTrackNumber() {
		return trackNumber;
	}

	public void setTrackNumber(String trackNumber) {
		this.trackNumber = trackNumber;
	}

	public String getTrackPrice() {
		return trackPrice;
	}

	public void setTrackPrice(String trackPrice) {
		this.trackPrice = trackPrice;
	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	
	

}
