package com.tsitraining.cread.FilmLog.Cucumber.StepDefinitions;

import com.tsitraining.cread.FilmLog.Film;
import com.tsitraining.cread.FilmLog.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.Assert.assertEquals;


@CucumberContextConfiguration
//@SpringBootTest
public class AddStep
{
    @Autowired

    private FilmRepository filmRepository;
    Film film;
    String expectedAnswer;
    int filmId;

    @Given("string title provided")
    public void string_title_provided()
    {
        film = new Film("LOTR", 1, 180);
    }

    @When("i add a film")
    public void i_add_a_film()
    {
        filmRepository.save(film);
        filmId = film.getFilm_id();
    }

    @Then("i should be told film added")
    public void i_should_be_told ()
    {
        Optional<Film> newFilmOptional = filmRepository.findById(filmId);
        Film newFilmActual = newFilmOptional.get();
        expectedAnswer = newFilmActual.getTitle();
        assertEquals(expectedAnswer,film.getTitle());
    }

}




