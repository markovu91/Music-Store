package com.ynn.musicrecords.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.ynn.muscirecords.model.Genre;
import com.ynn.muscirecords.repository.GenreRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	
	private GenreRepository genreRepository;
	
	
	public DevBootstrap(GenreRepository genreRepository) {
		this.genreRepository = genreRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
	}
	
	private void initData() {
		
		Genre genre = new Genre();
		genre.setGenreName("Heavy Metal");
		genreRepository.save(genre);
		System.out.println("saved!");
	}

}
