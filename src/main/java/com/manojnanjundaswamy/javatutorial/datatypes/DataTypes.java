package com.manojnanjundaswamy.javatutorial.datatypes;

/**
 * 
 * A variable in Java must be a specified data type<br>
 * 
 * Data types are divided into two groups:<br>
 * 
 * <b>Primitive data types</b> - includes byte, short, int, long, float, double,
 * boolean and char<br>
 * <b>Non-primitive data types</b> - such as String, Arrays and
 * Classes<br><br>
 * 
 * 
 * There are eight primitive data types in Java:<br>
 * <table class="ws-table-all notranslate">
 * <tbody>
 * <tr>
 * <th style="width:20%; text-align: left;">Data Type</th>
 * <th style="width:17%; text-align: left;">Size</th>
 * <th style="width:63%; text-align: left;">Description</th>
 * </tr>
 * <tr>
 * <td><code >byte</code></td>
 * <td>1 byte</td>
 * <td>Stores whole numbers from -128 to 127</td>
 * </tr>
 * <tr>
 * <td><code >short</code></td>
 * <td>2 bytes</td>
 * <td>Stores whole numbers from -32,768 to 32,767</td>
 * </tr>
 * <tr>
 * <td><code >int</code></td>
 * <td>4 bytes</td>
 * <td>Stores whole numbers from -2,147,483,648 to 2,147,483,647</td>
 * </tr>
 * <tr>
 * <td><code >long</code></td>
 * <td>8 bytes</td>
 * <td>Stores whole numbers from -9,223,372,036,854,775,808 to
 * 9,223,372,036,854,775,807</td>
 * </tr>
 * <tr>
 * <td><code >float</code></td>
 * <td>4 bytes</td>
 * <td>Stores fractional numbers. Sufficient for storing 6 to 7 decimal
 * digits</td>
 * </tr>
 * <tr>
 * <td><code >double</code></td>
 * <td>8 bytes</td>
 * <td>Stores fractional numbers. Sufficient for storing 15 decimal digits</td>
 * </tr>
 * <tr>
 * <td><code >boolean</code></td>
 * <td>1 bit</td>
 * <td>Stores true or false values</td>
 * </tr>
 * <tr>
 * <td><code >char</code></td>
 * <td>2 bytes</td>
 * <td>Stores a single character/letter or ASCII values</td>
 * </tr>
 * 
 * </tbody>
 * </table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class DataTypes {

	int myNum = 5;               // Integer (whole number)
	float myFloatNum = 5.99f;    // Floating point number
	char myLetter = 'D';         // Character
	boolean myBool = true;       // Boolean
	String myText = "Hello";     // String
}
