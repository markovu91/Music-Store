package com.ynn.muscirecords.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ynn.muscirecords.model.Album;
import com.ynn.muscirecords.model.Artist;
import com.ynn.muscirecords.model.Genre;
import com.ynn.muscirecords.model.User;
import com.ynn.muscirecords.model.DTO.AlbumDTO;
import com.ynn.muscirecords.model.DTO.ArtistDTO;
import com.ynn.muscirecords.repository.ArtistRepository;
import com.ynn.muscirecords.services.AlbumService;
import com.ynn.muscirecords.services.ArtistService;
import com.ynn.muscirecords.services.GenreService;
import com.ynn.muscirecords.services.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ArtistService artistService;
	
	@Autowired
	GenreService genreService;
	
	@Autowired
	AlbumService albumService;
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("")
	public String adminHome() {
		
		
		return "admin/home";
	}
	//ARTISTS
	@GetMapping("/artists")
	public String listArtists(Model model, @PageableDefault(page = 0, size = 10, sort = "idArtist") Pageable pageable) {
		
		Page<Artist> artistsPage = artistService.findPageableArtists(pageable);
		Sort.Order order = artistsPage.getSort().getOrderFor("idArtist");
		model.addAttribute("artistsPage", artistsPage);
		return "admin/artists/artists";
		
	}
	
	@GetMapping("/artists/new")
	public String addNewArtist(Model model) {
		model.addAttribute("action", "new");
		model.addAttribute("artistDTO", new ArtistDTO());
		
		HashSet<String> genres = new HashSet<>();
        for(Genre genre: genreService.findAll()){
            genres.add(genre.getGenreName());
        }        
        model.addAttribute("genres", genres);
		
		return "admin/artists/form";
		
		
	}
	
	@PostMapping("/artists/new")
	public String processNewArtist(Model model, @ModelAttribute("artistDTO") ArtistDTO artistDTO,
            BindingResult result) {
		artistService.save(artistDTO);
		return "redirect:/admin/artists";
	}
	
	
	@GetMapping("/artists/delete/{id}")
	public String deleteArtist(@PathVariable Integer id) {
		
	artistService.deleteArtist(id);
		
		
		
		return "redirect:/admin/artists";
		
		
	}
	
	//ALBUMS
	
	@GetMapping("/albums")
	public String listAlbums(Model model) {
		
		List<Album> albums = albumService.findAllAlbums();
		model.addAttribute("albums", albums);
		
		return "admin/albums/albums";
		
		
	}
	
	@GetMapping("/albums/new")
	public String addNewAlbum(Model model) {
		
		model.addAttribute("action", "new");
		model.addAttribute("albumDTO", new AlbumDTO());
		
		HashSet<String> artists = new HashSet<>();
        for(Artist artist: artistService.findAll()){
            artists.add(artist.getArtistName());
        }        
        model.addAttribute("artists", artists);
		
        return "admin/albums/form";
		
	}
	
	@PostMapping("/albums/new")
	public String addNewAlbum(Model model, @ModelAttribute("albumDTO") AlbumDTO albumDTO,
            BindingResult result) {
		
		albumService.save(albumDTO);
		return "redirect:/admin/albums";
		
	}
	
	@GetMapping("/albums/delete/{id}")
	public String deleteAlbum(@PathVariable Integer id) {
		
		albumService.deleteAlbum(id);
		
		
		return "redirect:/admin/albums";
		
	}
	
	
	
	//GENRES
	@GetMapping("/genres")
	public String listGenres(Model model) {
		
		List<Genre> genres = genreService.findAll();
		model.addAttribute("genres", genres);
		
		
		
		
		
	
		
		return "admin/genres/genres";
		
		
	}
	
	@GetMapping("/genres/new")
	public String addNewGenre(Model model) {
		
		model.addAttribute("action", "new");
        model.addAttribute("genre", new Genre() ); 
		return "admin/genres/form";
		
	}
	
	@PostMapping("/genres/new")
	public String processNewGenre(Model model, @ModelAttribute("genre") Genre genre,
            BindingResult result) {
		
		genre = genreService.save(genre);
		return "redirect:/admin/genres";
		
	}
	
	
	@GetMapping("/genres/edit/{id}")
	public String editGenre(Integer idGenre, Model model) {
		
		Genre genre = genreService.findByGenreId(idGenre).orElse(null);
		
		model.addAttribute("genre", genre);
		
		
		
		return "/admin/genres/edit";
		
		
	}
	
	@GetMapping("/genres/delete/{id}")
	public String deleteGenre(@PathVariable Integer id) {
		genreService.deleteGenre(id);
		
		return "redirect:/admin/genres";
		
	}
	
	//USERS
	@GetMapping("/users")
	public String listUsers(Model model) {
		
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		
		
		return "/admin/users/users";
	}
	
	@GetMapping("/users/delete/{id}")
	public String deleteUser(@PathVariable Integer id) {
		
		userService.deleteUser(id);
		
		return "redirect:/admin/users";
		
		
	}
	
	
	
	
	

	
	
	
	

}
