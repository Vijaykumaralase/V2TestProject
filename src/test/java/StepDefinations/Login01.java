package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login01 {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Step01");
	}

	@And("some other precondition")
	public void some_other_precondition() {
		 System.out.println("Step02");
	}

	@When("I complete action")
	public void i_complete_action() {
		 System.out.println("Step03");
	}

	@And("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step04");
	}

	@And("yet another action")
	public void yet_another_action() {
		System.out.println("Step05");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("Step06");
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("Step07");
	}


}
