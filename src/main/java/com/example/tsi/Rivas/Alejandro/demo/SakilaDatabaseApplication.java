package com.example.tsi.Rivas.Alejandro.demo;

import org.jacoco.report.ILanguageNames;
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

	public SakilaDatabaseApplication(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
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



	@GetMapping("/All_Languages")
	public @ResponseBody
	Iterable<Language> getAllLanguages() {
		return languageRepository.findAll();
	}
}
