package com.ynn.muscirecords.services;

import java.util.List;
import java.util.Optional;

import com.ynn.muscirecords.model.Genre;

public interface GenreService {
	
	List<Genre> findAll();

	Genre findByGenreName();
	
	Optional<Genre> findByGenreId(Integer idGenre);
	
	Genre save(Genre genre);
	
	public void deleteGenre(Integer id);
	

}
