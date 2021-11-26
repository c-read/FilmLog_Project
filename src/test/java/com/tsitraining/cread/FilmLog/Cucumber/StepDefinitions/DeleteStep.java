package com.tsitraining.cread.FilmLog.Cucumber.StepDefinitions;

import com.tsitraining.cread.FilmLog.Film;
import com.tsitraining.cread.FilmLog.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.assertTrue;


@CucumberContextConfiguration
public class DeleteStep
{
    @Autowired

    private FilmRepository filmRepository;
    Film film;
    String expectedAnswer;
    int filmId;

    @Given("new film added")
    public void new_film_added()
    {
        film = new Film("Scarface", 1, 180);
        filmRepository.save(film);

    }

    @When("i delete a film")
    public void i_delete_a_film()
    {
        filmId = film.getFilm_id();
        filmRepository.deleteById(filmId);
    }

    @Then("i should be told film deleted")
    public void i_should_be_told ()
    {
        String message = "film deleted";
    }

}




