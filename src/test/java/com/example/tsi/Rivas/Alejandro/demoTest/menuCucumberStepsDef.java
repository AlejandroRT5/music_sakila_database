package com.example.tsi.Rivas.Alejandro.demoTest;

import com.example.tsi.Rivas.Alejandro.demo.Film;
import com.example.tsi.Rivas.Alejandro.demo.Language;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IsItSpanish {
    static String isItSpanish(String language) {
        return "Spanish".equals(language) ? "Yes" : "No";
    }
}

public class menuCucumberStepsDef {
    private static String language;
    private static String actualAnswer;

    @Given("The film is available")
    public void the_film_is_available() {
        Film film = new Film();
        throw new io.cucumber.java.PendingException();
    }
    @When("Film is in {string}")
    public void film_is_not_in(String string) {
        menuCucumberStepsDef.language = string;
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        assertEquals(string, menuCucumberStepsDef.actualAnswer);
        throw new io.cucumber.java.PendingException();
    }

}
