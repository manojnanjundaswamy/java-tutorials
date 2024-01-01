package com.manojnanjundaswamy.javatutorial.strings;

/**
 * 
 * <p>Java uses the <code>+</code> operator for both addition and concatenation.</p>
 * <p>Numbers are added.<br> Strings are concatenated.</p>
 * <p>If you add two numbers, the result will be a number:</p>
 * <p>If you add two strings, the result will be a string concatenation:</p>
 * <p>If you add a number and a string, the result will be a string concatenation:</p>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class NumbersAndStrings {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		//Outputs 30 (an integer/number)
		System.out.println(x + y); 
		
		String x1 = "10";
		String y1 = "20";
		//Outputs 1020 (a String)
		System.out.println(x1 + y1);  
		
		String x2 = "10";
		int y2 = 20;
		//Outputs 1020 (a String)
		System.out.println(x2 + y2);  

	}

}
