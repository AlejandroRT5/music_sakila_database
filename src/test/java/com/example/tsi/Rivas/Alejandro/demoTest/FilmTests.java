package com.example.tsi.Rivas.Alejandro.demoTest;

import com.example.tsi.Rivas.Alejandro.demo.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTests {
    @Test
    void setTitleTest() {
        Film test = new Film("Test title", "Test Description", 1997, 1);
        test.setTitle("Star Wars");
        assertEquals(test.getTitle(), "Star Wars", "Set title function is not working properly.");
    }
    @Test
    void setDescriptionTest() {
        Film test = new Film("Test title", "Test Description", 1997, 1);
        test.setDescription("Iconic 6 films before Disney ruined it");
        String answer = "Iconic 6 films before Disney ruined it";
        assertEquals(test.getDescription(), answer,"Film description not being set properly");
    }
    @Test
    void setReleaseDateTest() {
        Film testRDate = new Film("Test title", "Test Description", 1997, 1);
        testRDate.setRelease_year(1977);
        assertEquals(testRDate.getRelease_year(), 1977, "The set function for the release year of a film is not working properly.");
    }
    @Test
    void setLanguageTest() {
        Film testLanguageSet = new Film("Test title", "Test Description", 1997,1);
        testLanguageSet.setLanguage_id(0);
        assertEquals(testLanguageSet.getLanguage_id(), 0, "Language ID not set properly.");
    }
}
