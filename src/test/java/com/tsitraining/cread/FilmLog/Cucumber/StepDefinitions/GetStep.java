package com.tsitraining.cread.FilmLog.Cucumber.StepDefinitions;

import com.tsitraining.cread.FilmLog.Film;
import com.tsitraining.cread.FilmLog.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


@CucumberContextConfiguration
public class GetStep
{
    @Autowired

    private FilmRepository filmRepository;
    Film film;

    @Given("films in database")
    public void films_in_database()
    {
        Optional<Film> film = filmRepository.findById(1);
        Film newFilm = film.get();
        if (newFilm.getLanguage_id() != 1)
        {
            throw new RuntimeException("failed");
        }
    }

    @When("i search for films")
    public void i_search_for_films()
    {
        filmRepository.findAll();
    }

    @Then("i should be told films in database")
    public void i_should_be_told_films_in_database ()
    {
        String message = "success";
    }
}
