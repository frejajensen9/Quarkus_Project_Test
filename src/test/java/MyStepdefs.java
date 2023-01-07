import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.acme.GreetingResource;
import org.acme.PersonResource;

import static org.testng.Assert.assertEquals;

public class MyStepdefs {

    String result;
    GreetingResource service = new GreetingResource();
    PersonResource person = new PersonResource();
    @When("I call the hello service")
    public void iCallTheHelloService() {
        result = service.hello();
    }

    @Then("I get the answer {string}")
    public void iGetTheAnswer(String string) {
        assertEquals(string,result);
    }

    @Given("the getPerson method has been called")
    public void theGetPersonMethodHasBeenCalled() {
    }

    @When("the response is received")
    public void theResponseIsReceived() {
    }

    @Then("the response should contain a person object with name {string} and address {string}")
    public void theResponseShouldContainAPersonObjectWithNameAndAddress(String arg0, String arg1) {
    }
}
