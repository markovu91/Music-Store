package com.ynn.muscirecords.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ynn.muscirecords.model.Genre;
import com.ynn.muscirecords.repository.GenreRepository;
import com.ynn.muscirecords.services.GenreService;

@Service
public class GenreServiceImpl implements GenreService {
	
	@Autowired
	GenreRepository genreRepository;

	@Override
	public List<Genre> findAll() {
		
		List<Genre> genres = genreRepository.findAll();
		return genres;
	}

	@Override
	public Genre findByGenreName() {
		Genre genre = genreRepository.findByGenreName(null);
		return genre;
	}

	@Override
	public Genre save(Genre genre) {
		
		Genre newGenre = new Genre();
		
		newGenre.setGenreName(genre.getGenreName());
		
		
		return genreRepository.save(newGenre);
	}

	@Override
	public void deleteGenre(Integer id) {
		if(id != null) {
			genreRepository.deleteById(id);
		}
		
	}

	@Override
	public Optional<Genre> findByGenreId(Integer idGenre) {
		
		return genreRepository.findById(idGenre);
	}

	

	

}
