package com.manojnanjundaswamy.javatutorial.variables;

/**
 * Ways of assigning values to multiple variable
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class DeclareMultipleVariables {

	public static void main(String[] args) {

//		To declare more than one variable of the same type, you can use a comma-separated list:
//		Instead of writing:
		int x = 5;
		int y = 6;
		int z = 50;
		System.out.println(x + y + z);

//		You can simply write:
		int x1 = 5, y1 = 6, z1 = 50;
		System.out.println(x1 + y1 + z1);

//		One Value to Multiple Variables
//		You can also assign the same value to multiple variables in one line:
		int x2, y2, z2;
		x2 = y2 = z2 = 50;
		System.out.println(x2 + y2 + z2);

	}

}
