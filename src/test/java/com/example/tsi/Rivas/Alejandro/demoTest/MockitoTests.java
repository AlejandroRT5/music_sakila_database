package com.example.tsi.Rivas.Alejandro.demoTest;
import com.example.tsi.Rivas.Alejandro.demo.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MockitoTests {
    private SakilaDatabaseApplication sakilaDatabaseApplication;

    @Mock
    private LanguageRepository languageRepository;
    @Mock
    private FilmRepository filmRepository;

    @BeforeEach
    void Setup() {
        sakilaDatabaseApplication = new SakilaDatabaseApplication(languageRepository, filmRepository);
    }

    @Test
    public void testAddLanguage(){
        Language saveLanguage = new Language("Test Language");
        String expected = "save";
        String actual = sakilaDatabaseApplication.addLanguage(saveLanguage.getName());
        // comma after getName() to add more methods if data requires it
        // also add after "Test Language" if constructor has more than 1 parameter, like actor database

        // Hosts data as a virtual temp database for accessing
        ArgumentCaptor<Language>languageArgumentCaptor = ArgumentCaptor.forClass(Language.class);
        verify(languageRepository).save(languageArgumentCaptor.capture());

        languageArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Language not successfully added to mock database.");


    }
    @Test
    public void testAddFilm(){
        Film saveFilm = new Film(1,"test title", "test description", 1997);
        String expected = "save";
        String actual = sakilaDatabaseApplication.addFilm(saveFilm.getFilm_id(), saveFilm.getTitle(), saveFilm.getDescription(), saveFilm.getRelease_year());
        // comma after getName() to add more methods if data requires it
        // also add after "Test Language" if constructor has more than 1 parameter, like actor database

        // Hosts data as a virtual temp database for accessing
        ArgumentCaptor<Film>filmArgumentCaptor = ArgumentCaptor.forClass(Film.class);
        verify(filmRepository).save(filmArgumentCaptor.capture());

        filmArgumentCaptor.getValue();
        Assertions.assertEquals(expected, actual, "Language not successfully added to mock database.");


    }


}


