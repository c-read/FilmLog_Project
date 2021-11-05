package Cucumber;

import com.tsitraining.cread.FilmLog.Film;
import com.tsitraining.cread.FilmLog.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;


@CucumberContextConfiguration
@SpringBootTest
public class StepDefsSearch
{
    @Autowired

    private FilmRepository filmRepository;
    Film film;
    String title;

    @Given("film in database")
    public void film_in_database()
    {
        film = new Film(1, "LOTR",1,180);
        filmRepository.save(film);
    }

    @When("i search for film")
    public void i_search_for_film()
    {

        var allFilms = filmRepository.findAll();
        for (Film item : allFilms)
        {
            Film newFilm = item;
        }

    }

    @Then("i should be told {string} in database")
    public void i_should_be_told (String expectedAnswer)
    {
        assertEquals(expectedAnswer, film.getTitle());
    }
}
