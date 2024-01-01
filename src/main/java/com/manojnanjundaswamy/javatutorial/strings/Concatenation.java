package com.manojnanjundaswamy.javatutorial.strings;

/**
 * @author Manoj Nanjundaswamy
 *
 */
public class Concatenation {

	public static void main(String[] args) {

		String firstName = "Manoj";
		String lastName = "Nanjundaswamy";

//		The + operator can be used between strings to combine them. This is called concatenation:
		System.out.println(firstName + " " + lastName);

//		You can also use the concat() method to concatenate two strings:
		System.out.println(firstName.concat(lastName));

//		Similarly you can perform method chaining on String method
		System.out.println(firstName.concat(" ").concat(lastName));
	}

}
