package com.example.tsi.Rivas.Alejandro.demoTest;

import com.example.tsi.Rivas.Alejandro.demo.Language;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class LanguageTests {
        @Test
        void setNameTest(){
            Language name = new Language();
            name.setName("Spanish");
            assertEquals(name.getName(),"Spanish","Set language name not working properly");

        }
        

    }

