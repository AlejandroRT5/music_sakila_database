package com.example.tsi.Rivas.Alejandro.demoTest;
import com.example.tsi.Rivas.Alejandro.demo.Language;
import com.example.tsi.Rivas.Alejandro.demoTest.IsItSpanish;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/Cucumber", glue = "com.example.tsi.Rivas.Alejandro.demoTest")


public class runCucumberTest {

    //@Test
    //void runTest(){

    //}


}
