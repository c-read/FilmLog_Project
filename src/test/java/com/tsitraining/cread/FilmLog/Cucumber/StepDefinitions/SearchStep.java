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
//@SpringBootTest
public class SearchStep
{
    @Autowired

    private FilmRepository testFilmRepository;
    Film film;
    Film expectedAnswer;

    @Given("film in database")
    public void film_in_database()
    {
        film = new Film(1,"LOTR",1,180);
        testFilmRepository.save(film);
    }

    @When("i search for film")
    public void i_search_for_film()
    {

//        Iterable<Film> allFilms = testFilmRepository.findAll();
//        for (Film item : allFilms)
//        {
//            Film newFilm = item;
//            expectedAnswer = newFilm.getTitle();
//        }


//        is the below doing the exact same?
        Optional<Film> newFilmOptional = testFilmRepository.findById(1);
        expectedAnswer = newFilmOptional.get();
        assertEquals(expectedAnswer.getTitle(),film.getTitle());


    }

    @Then("i should be told film in database")
    public void i_should_be_told_film_in_database ()
    {
        assertEquals(expectedAnswer.getTitle(), film.getTitle());
    }
}
