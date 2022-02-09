package com.example.tsi.Rivas.Alejandro.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilmTests {
    @Test
    void setTitleTest() {
        Film testTitle = new Film();
        testTitle.setTitle("Star Wars");
        assertEquals(testTitle.getTitle(), "Star Wars", "Set title function is not working properly.");
    }
    @Test
    void setDescriptionTest() {
        Film testDescription = new Film();
        testDescription.setDescription("Iconic 6 films before Disney ruined it");
        String answer = "Iconic 6 films before Disney ruined it";
        assertEquals(testDescription.getDescription(), answer,"Film description not being set properly");
    }
    @Test
    void setReleaseDateTest() {
        Film testRDate = new Film();
        testRDate.setRelease_year(1977);
        assertEquals(testRDate.getRelease_year(), 1977, "The set function for the release year of a film is not working properly.");
    }
    @Test
    void setRentDur() {
        Film testRentDur = new Film();
        testRentDur.setRental_duration(7);
        assertEquals(testRentDur.getRental_duration(), 7, "Set function for rental duration not working properly.");
    }
    @Test
    void setRentalRateTest() {
        Film testRentalRate = new Film();
        testRentalRate.setRental_rate(5);
        assertEquals(testRentalRate.getRental_rate(), 5, "Set function for rental rate not working properly");
    }
    @Test
    void setLengthTest() {
        Film testLength = new Film();
        testLength.setLength(149);
        assertEquals(testLength.getLength(), 149, "Set function for length of film is not working properly.");
    }
    @Test
    void setReplaCostTest() {
        Film testReplaCost = new Film();
        testReplaCost.setReplacement_cost(10.50);
        assertEquals(testReplaCost.getReplacement_cost(), 10.50, "Set function for replacement cost not working properly.");
    }
    @Test
    void setRatingTest() {
        Film testRating = new Film();
        testRating.setRating("4.6*");
        assertEquals(testRating.getRating(), "4.6*", "Set function for the rating of the film not working properly.");
    }
    @Test
    void setSpecialFeatTest() {
        Film testSpecFeat = new Film();
        testSpecFeat.setSpecial_features("Not ruined by Disney");
        assertEquals(testSpecFeat.getSpecial_features(),"Not ruined by Disney", "Set function for the special features is not working properly.");
    }
}
