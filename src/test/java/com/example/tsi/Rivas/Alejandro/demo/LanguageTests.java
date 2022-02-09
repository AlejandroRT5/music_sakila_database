package com.example.tsi.Rivas.Alejandro.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class LanguageTests {
        @Test
        void setNameTest(){
            Language testName = new Language();
            testName.setName("Mandarin");
            assertEquals(testName.getName(),"Mandarin", "Language name should be Mandarin. Error in getName function.");
        }
        //@Test
        //void getLanguage_idTest(){
        //    Language German = new Language("German");
         //   assertEquals(German.getLanguage_id(), 6, "Language id function not accessing the id number corresponding to the given language German.");
        //}

    }

