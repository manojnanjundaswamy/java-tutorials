package com.manojnanjundaswamy.javatutorial.variables;

/**
 * <h4>Variables are containers for storing data values.</h4><br>
 * 
 * In Java, there are different types of variables, for example:<br>
 * 
 * <b>String</b> - stores text, such as "Hello". String values are surrounded by
 * double quotes <br>
 * <b>int</b> - stores integers (whole numbers), without decimals, such as 123
 * or -123 <br>
 * <b>float</b> - stores floating point numbers,with decimals, such as 19.99 or
 * -19.99 <br>
 * <b>char</b> - stores single characters, such as 'a' or 'B'. Char values are
 * surrounded by single quotes <br>
 * <b>boolean</b> - stores values with two states: true or false<br>
 * 
 * <pre>
Syntax
 type variableName = value;
 * </pre>
 *
 * @author Manoj Nanjundaswamy
 */
public class Variables {

//	Syntax:	type variableName = value;

	public static void main(String[] args) {
//		Create a variable called name of type String and assign it the value "Manoj":
		String name = "Manoj";
		System.out.println(name);

//		Create a variable called myNum of type int and assign it the value 99:
		int myNum = 99;
		System.out.println(myNum);

		myNum = 20; // myNum is now 20
		System.out.println(myNum);

//		final int myNum2 = 15;
//		myNum2 = 20;  // will generate an error: cannot assign a value to a final variable

//		Create a variable called myFloatNum of type float and assign it the value 5.99:
		float myFloatNum = 5.99f;
		System.out.println(myFloatNum);

//		Create a variable called myLetter of type char and assign it the character D:
		char myLetter = 'D';
		System.out.println(myLetter);

//		Create a variable called myBool of type boolean and assign it the value true:
		boolean myBool = true;
		System.out.println(myBool);
	}

}
