package com.manojnanjundaswamy.javatutorial.variables;

/**
 * @author Manoj Nanjundaswamy
 */
public class PrintVariables {

	public static void main(String[] args) {

//		To combine both text and a variable, use the + character:
		String name = "Manoj";
		System.out.println("Hello " + name);

//		You can also use the + character to add a variable to another variable:
		String firstName = "Manoj ";
		String lastName = "Nanjundaswamy";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
//		For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
		int x = 5;
		int y = 6;
		System.out.println(x + y); // Print the value of x + y
	}

}
