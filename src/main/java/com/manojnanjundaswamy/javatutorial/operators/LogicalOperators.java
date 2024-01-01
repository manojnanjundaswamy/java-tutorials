package com.manojnanjundaswamy.javatutorial.operators;

/**
 * <p>
 * Logical operators are used to determine the logic between variables or
 * values:
 * </p>
 * 
 * <table>
 * <tbody>
 * <tr>
 * <th style="width:15%;text-align:left">Operator</th>
 * <th style="width:20%;text-align:left">Name</th>
 * <th style="width:35%;text-align:left">Description</th>
 * <th style="width:20%;text-align:left">Example</th>
 * </tr>
 * <tr>
 * <td>&amp;&amp;&nbsp;</td>
 * <td>Logical and</td>
 * <td>Returns true if both statements are true</td>
 * <td>x &lt; 5 &amp;&amp;&nbsp; x &lt; 10</td>
 * </tr>
 * <tr>
 * <td>||&nbsp;</td>
 * <td>Logical or</td>
 * <td>Returns true if one of the statements is true</td>
 * <td>x &lt; 5 || x &lt; 4</td>
 * </tr>
 * <tr>
 * <td>!</td>
 * <td>Logical not</td>
 * <td>Reverse the result, returns false if the result is true</td>
 * <td>!(x &lt; 5 &amp;&amp; x &lt; 10)</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class LogicalOperators {

	public static void main(String[] args) {

		int x = 5;

		// returns true because 5 is greater than 3 AND 5 is less than 10
		System.out.println(x > 3 && x < 10);

		// returns true because one of the conditions are true (5 is greater than 3, but
		// 5 is not less than 4)
		System.out.println(x > 3 || x < 4);

		// returns false because ! (not) is used to reverse the result
		System.out.println(!(x > 3 && x < 10));

	}

}
