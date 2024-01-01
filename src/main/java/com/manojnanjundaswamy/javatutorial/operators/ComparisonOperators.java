package com.manojnanjundaswamy.javatutorial.operators;

/**
 * <p>
 * Comparison operators are used to compare two values (or variables). This is
 * important in programming, because it helps us to find answers and make
 * decisions.
 * </p>
 * <p>
 * The return value of a comparison is either <code>true</code> or
 * <code>false</code>.
 * </p>
 * 
 * 
 * <table>
 * <tbody>
 * <tr>
 * <th style="width:25%; text-align: left;">Operator</th>
 * <th style="width:35%; text-align: left;">Name</th>
 * <th style="width:30%; text-align: left;">Example</th>
 * </tr>
 * <tr>
 * <td>==</td>
 * <td>Equal to</td>
 * <td>x == y</td>
 * </tr>
 * <tr>
 * <td>!=</td>
 * <td>Not equal</td>
 * <td>x != y</td>
 * </tr>
 * <tr>
 * <td>&gt;</td>
 * <td>Greater than</td>
 * <td>x &gt; y</td>
 * </tr>
 * <tr>
 * <td>&lt;</td>
 * <td>Less than</td>
 * <td>x &lt; y</td>
 * </tr>
 * <tr>
 * <td>&gt;=</td>
 * <td>Greater than or equal to</td>
 * <td>x &gt;= y</td>
 * </tr>
 * <tr>
 * <td>&lt;=</td>
 * <td>Less than or equal to</td>
 * <td>x &lt;= y</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class ComparisonOperators {

	public static void main(String[] args) {

		int x = 5;
		int y = 3;

		// returns false, because 5 is not equal to 3
		System.out.println(x == y);

		// returns true, because 5 is not equal to 3
		System.out.println(x != y);

		// returns true, because 5 is higher than 3
		System.out.println(x > y);

		// returns false, because 5 is not higher than 3
		System.out.println(x < y);

		// returns true because 5 is greater, or equal, to 3
		System.out.println(x >= y);

		// returns false because 5 is neither less than or equal
		System.out.println(x <= y);

	}

}
