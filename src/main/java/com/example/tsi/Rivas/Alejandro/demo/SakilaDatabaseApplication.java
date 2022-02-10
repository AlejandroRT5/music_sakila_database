package com.example.tsi.Rivas.Alejandro.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/Home")
public class SakilaDatabaseApplication {

	@Autowired
	private LanguageRepository languageRepository;
	@Autowired
	private FilmRepository filmRepository;
	private String save = "save";

	public SakilaDatabaseApplication(LanguageRepository languageRepository,
									 FilmRepository filmRepository
									 ) {
		this.languageRepository = languageRepository;
		this.filmRepository = filmRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SakilaDatabaseApplication.class, args);
	}

	@PostMapping("/Add_Languages")
	public @ResponseBody String addLanguage(@RequestParam String name) {
		Language addLanguage = new Language(name);
		languageRepository.save(addLanguage);
		return save;
	}

	@PostMapping("/Add_Films")
	public @ResponseBody String addFilm(@RequestParam String title, String description, int release_year, int language_id) {
		Film addFilm = new Film(title, description, release_year, language_id);
 		filmRepository.save(addFilm);
		 return save;

	}
	@GetMapping("/All_Languages")
	public @ResponseBody
	Iterable<Language> getAllLanguages() {
		return languageRepository.findAll();
	}

	@GetMapping("/All_Films")
	public @ResponseBody
	Iterable<Film> getAllFilms() {
		return filmRepository.findAll();
	}

}

