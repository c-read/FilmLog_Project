package Cucumber;
import com.tsitraining.cread.FilmLog.Film;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class CreateActorScenario
{
    private String thisFilmName;
    private String actualAnswer;
    Film film = new Film("harry potter",1,120);


    @Given("no current film entry")
    public void no_current_film_entry ()
    {
        thisFilmName = "harry potter";
    }

    @When("create new film method")
    public void create_new_film_method ()
    {
        actualAnswer = IsItHarry.isItHarry(thisFilmName);
    }

    @Then("i should be told {string}")
    public void i_should_be_told (String expectedAnswer)
    {
        assertEquals(expectedAnswer,actualAnswer);
    }

}
