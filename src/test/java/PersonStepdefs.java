import data.Person;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.acme.PersonResource;

import static org.testng.Assert.assertEquals;

public class PersonStepdefs {

    String result;
    PersonResource person = new PersonResource();
    Person expectedPerson = new Person();
    @Given("the getPerson method has been called")
    public void theGetPersonMethodHasBeenCalled() { result = String.valueOf(person.getPerson());
        System.out.println(result);}

    @When("the response is received")
    public void theResponseIsReceived() {
        /*expectedPerson.setName("Freja");
        assertEquals(expectedPerson, person.getPerson());*/
    }

    @Then("the response should contain a person object with name {string} and address {string}")
    public void theResponseShouldContainAPersonObjectWithNameAndAddress(String arg0, String arg1) {
    }
}
