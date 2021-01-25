package com.ynn.muscirecords.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.model.DTO.AlbumDTO;
import com.ynn.muscirecords.repository.AlbumRepository;
import com.ynn.muscirecords.repository.ArtistRepository;
import com.ynn.muscirecords.services.AlbumService;
import com.ynn.muscirecords.services.ArtistService;

@Service
public class AlbumServiceImpl implements AlbumService{

	@Autowired
	private AlbumRepository albumRepository;
	
	@Autowired
	private ArtistService artistService;

	@Override
	public List<Album> findAllAlbums() {
		List<Album> albums = albumRepository.findAll();
		return albums;
	}

	@Override
	public Album getAlbumById(Integer id) {
		Optional<Album> optional = albumRepository.findById(id);
		Album album = null;
		if (optional.isPresent()) {
			album = optional.get();
		} else {throw new RuntimeException("Album not found for id :: "+id);}
		return album;
	}

	@Override
	public List<Album> getAlbumsByArtist(Artist artist) {
		List<Album> albumsByArtist = albumRepository.findByArtist(artist);
		return albumsByArtist;
	}

	@Override
	public Album save(AlbumDTO albumDTO) {
		Album newAlbum = new Album();
		Artist artist = artistService.findByArtistName(albumDTO.getArtistName());
		
		newAlbum.setAlbumTitle(albumDTO.getAlbumTitle());
		newAlbum.setArtist(artist);
		newAlbum.setAlbumReleaseYear(Integer.parseInt(albumDTO.getAlbumReleaseYear()));
		newAlbum.setAlbumCoverArt(albumDTO.getAlbumCoverArt());
		newAlbum.setAlbumPrice(Double.parseDouble(albumDTO.getAlbumPrice()));
		newAlbum.setAlbumCatalogNumber(albumDTO.getAlbumCatalogNumber());
		newAlbum.setAlbumEdition(albumDTO.getAlbumEdition());
		newAlbum.setAlbumQuantity(Integer.parseInt(albumDTO.getAlbumQuantity()));
		
		
		
		return albumRepository.save(newAlbum);
	}

	@Override
	public void deleteAlbum(Integer id) {
		if(id != null) {
			
			albumRepository.deleteById(id);
		}
		
	}
	
	


}
