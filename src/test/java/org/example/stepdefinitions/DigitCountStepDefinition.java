package org.example.stepdefinitions;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DigitCountStepDefinition {
    private Integer number;
    private int digitCount;

    @Given("a java number parameter {int}")
    public void a_java_number_parameter(Integer num) {
        number = num;
    }

    @When("count digits in the integer")
    public void count_digits_in_the_integer() {
        digitCount = Integer.toString(Math.abs(number)).length();
    }

    @Then("result should be {int}")
    public void result_should_be(Integer expectedDigitCount) {
        assertEquals((int) expectedDigitCount, digitCount);
    }
}
