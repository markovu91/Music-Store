package com.ynn.muscirecords.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.services.AlbumService;

@Controller
public class HomeController {

	@Autowired
	private AlbumService albumService;
	
	
	@RequestMapping("/")
	public String home() {
	
		return "index";
	}
	
	@GetMapping("/store")
	public String store(Model model) {
		List<Album> albums = new ArrayList<>();
		albums = albumService.getAllAlbums();
		Album album = new Album();
		Artist artist = album.getArtist();
		model.addAttribute("albums", albums);
		model.addAttribute("artist", artist);
		
		return "store";
		
	}
	
	
}
