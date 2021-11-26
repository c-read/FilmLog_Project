//package com.tsitraining.cread.FilmLog.Cucumber.StepDefinitions;
//
//import com.tsitraining.cread.FilmLog.Film;
//import com.tsitraining.cread.FilmLog.FilmRepository;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.cucumber.spring.CucumberContextConfiguration;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//
//import static org.junit.Assert.assertEquals;
//
//
//@CucumberContextConfiguration
////@SpringBootTest
//public class UpdateStep
//{
//    @Autowired
//
//    private FilmRepository filmRepository;
//    Film film;
//    Film updatedFilm;
//    String expectedAnswer;
//    int filmId;
//
//    @Given("new film is added")
//    public void new_film_is_added()
//    {
//        film = new Film("LOTR", 2, 180);
//        filmRepository.save(film);
//        filmId = film.getFilm_id();
//    }
//
//    @When("i update the film")
//    public void i_update_the_film()
//    {
//        Optional<Film> optionalFilm = filmRepository.findById(filmId);
//        Film updatedFilm = optionalFilm.get();
//        updatedFilm.setTitle("gladiator");
//        updatedFilm.setLength(200);
//        filmId=updatedFilm.getFilm_id();
//        filmRepository.save(updatedFilm);
//    }
//
//    @Then("i should be told film updated")
//    public void i_should_be_told ()
//    {
//        Optional<Film> newOptionalFilm = filmRepository.findById(filmId);
//        Film newFilmActual = newOptionalFilm.get();
//        expectedAnswer = newFilmActual.getTitle();
//        assertEquals(expectedAnswer,updatedFilm.getTitle());
//    }
//
//}
//
//
//
//
