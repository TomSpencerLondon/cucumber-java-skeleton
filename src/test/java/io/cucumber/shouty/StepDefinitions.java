package io.cucumber.shouty;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

  private Person sean;
  private Person lucy;
  private String messageFromSean;

  @Given("Lucy is located {int} metres from Sean")
  public void lucy_is_located_metres_from_Sean(Integer distance) {
    lucy = new Person();
    sean = new Person();
    lucy.moveTo(distance, sean);
  }

  @When("Sean shouts {string}")
  public void sean_shouts(String message) {
    messageFromSean = message;
    sean.shout(message);
  }

  @Then("Lucy hears Sean's message")
  public void lucy_hears_Sean_s_message() {
    assertEquals(asList(messageFromSean), lucy.getMessagesHeard());
  }
}
