package com.spartaglobal.cucumber_intro;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberIntroStepDefs {
    @Given("cucumber is set up correctly")
    public void cucumber_is_set_up_correctly() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        System.out.println("this is when given runs");
    }

    @When("I run the tests")
    public void i_run_the_tests() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        System.out.println("this is when when runs");
    }

    @Then("I can see them run")
    public void i_can_see_them_run() {
        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
        System.out.println("this is when then runs");
    }
}
