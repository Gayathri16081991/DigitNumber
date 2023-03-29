package org.example.stepdefinitions;

import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class DigitCountStepDefinition {
    private Integer number;
    private Float numbers;
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

    @And("a java float number parameter {float} {int}")
    public void aJavaFloatNumberParameter(float numbers, int expectedDigitCount) {
        this.numbers=numbers;
        String numberString = Float.toString(numbers);

        // Remove any leading minus sign
        if (numberString.charAt(0) == '-') {
            numberString = numberString.substring(1);
        }

        // Remove any decimal point and leading zeroes
        numberString = numberString.replace(".", "").replaceFirst("^0+(?!$)", "");

        // Count the remaining digits
        digitCount = numberString.length();

        assertEquals(expectedDigitCount, digitCount);
    }

}
