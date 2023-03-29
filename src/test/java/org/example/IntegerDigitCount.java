package org.example;

import java.util.Scanner;

public class IntegerDigitCount {
	 // Function to count the number of digits in the integer part of a Number
	  public static int countIntegerDigits(Number enteredNumber) {
	    // Extract the integer part of the enteredNumber
	    int integerValue = enteredNumber.intValue();
	    // If the integer part is 0, it has 1 digit
	    if (integerValue == 0) {
	      return 1;
	    }
	    // Count the number of digits in the integer part
	    int digitCount = 0;
	    while (integerValue != 0) {
	      integerValue /= 10;
	      ++digitCount;
	    }
	    return digitCount;
	  }

	  // Main method to get input from user and display the number of digits
	  public static void main(String[] args) {
	    // Create a Scanner object to read input from the user
	    Scanner scanner = new Scanner(System.in);
	    // Prompt the user to enter a number
	    System.out.println("Enter the number : ");
	    // Read a float value from the user
	    float enteredNumber = scanner.nextFloat();
	    float f = 0;
		// Call the countIntegerDigits function to count the digits in the integer part of the enteredNumber
	    int numDigits = countIntegerDigits(enteredNumber+f);
	    // Display the number of digits to the user
	    System.out.println("Number of Digits : " + numDigits);
	  }
}
