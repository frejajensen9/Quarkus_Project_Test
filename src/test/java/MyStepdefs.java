import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.acme.GreetingResource;

import static org.testng.Assert.assertEquals;

public class MyStepdefs {

    String result;
    GreetingResource service = new GreetingResource();
    @When("I call the hello service")
    public void iCallTheHelloService() {
        result = service.hello();
    }

    @Then("I get the answer {string}")
    public void iGetTheAnswer(String string) {
        assertEquals(string,result);
    }
}
