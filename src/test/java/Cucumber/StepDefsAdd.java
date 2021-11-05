package Cucumber;
import com.tsitraining.cread.FilmLog.Film;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class StepDefsAdd
{
    private String thisFilmTitle;
    private String actualAnswer;
    Film film = new Film("LOTR",1,120);

    @Given("all inputs are provided")
    public void no_current_film_entry ()
    {
        thisFilmTitle = "LOTR";
    }

    @When("i try to add a film")
    public void create_new_film_method ()
    {
        actualAnswer = IsItLOTR.isItLotr(thisFilmTitle);
    }

    @Then("a string is returned {string}")
    public void i_should_be_told (String expectedAnswer)
    {
        assertEquals(expectedAnswer,actualAnswer);
    }

}
