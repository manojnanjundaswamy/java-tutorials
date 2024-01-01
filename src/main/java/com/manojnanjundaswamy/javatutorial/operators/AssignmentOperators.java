package com.manojnanjundaswamy.javatutorial.operators;

/**
 * <p>
 * Assignment operators are used to assign values to variables.
 * </p>
 * <p>
 * A list of all assignment operators:
 * </p>
 * 
 * <table class="ws-table-all notranslate">
 * <tbody>
 * <tr>
 * <th style="width:30%; text-align: left;">Operator</th>
 * <th style="width:30%; text-align: left;">Example</th>
 * <th style="width:30%; text-align: left;">Same As</th>
 * </tr>
 * <tr>
 * <td>=</td>
 * <td>x = 5</td>
 * <td>x = 5</td>
 * </tr>
 * <tr>
 * <td>+=</td>
 * <td>x += 3</td>
 * <td>x = x + 3</td>
 * </tr>
 * <tr>
 * <td>-=</td>
 * <td>x -= 3</td>
 * <td>x = x - 3</td>
 * </tr>
 * <tr>
 * <td>*=</td>
 * <td>x *= 3</td>
 * <td>x = x * 3</td>
 * </tr>
 * <tr>
 * <td>/=</td>
 * <td>x /= 3</td>
 * <td>x = x / 3</td>
 * </tr>
 * <tr>
 * <td>%=</td>
 * <td>x %= 3</td>
 * <td>x = x % 3</td>
 * </tr>
 * <tr>
 * <td>&amp;=</td>
 * <td>x &amp;= 3</td>
 * <td>x = x &amp; 3</td>
 * </tr>
 * <tr>
 * <td>|=</td>
 * <td>x |= 3</td>
 * <td>x = x | 3</td>
 * </tr>
 * <tr>
 * <td>^=</td>
 * <td>x ^= 3</td>
 * <td>x = x ^ 3</td>
 * </tr>
 * <tr>
 * <td>&gt;&gt;=</td>
 * <td>x &gt;&gt;= 3</td>
 * <td>x = x &gt;&gt; 3</td>
 * </tr>
 * <tr>
 * <td>&lt;&lt;=</td>
 * <td>x &lt;&lt;= 3</td>
 * <td>x = x &lt;&lt; 3</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class AssignmentOperators {

	public static void main(String[] args) {
//		the assignment operator (=) to assign the value 10 to a variable called x:
		int x = 10;

//		addition assignment operator (+=) adds a value to a variable:
		x += 5;
		System.out.println(x);

//		*=		Same as x = x * 3
		x = 10;
		x *= 3;
		System.out.println(x);

//		/=		Same as x = x / 3
		x = 10;
		x /= 3;
		System.out.println(x);

//		%=		Same as x = x % 3
		x = 10;
		x %= 3;
		System.out.println(x);

//		&=		Same as x = x & 3
		x = 10;
		x &= 3;
		System.out.println(x);

//		|=		Same as x = x | 3
		x = 10;
		x |= 3;
		System.out.println(x);

//		^=		Same as x = x ^ 3
		x = 10;
		x ^= 3;
		System.out.println(x);

//		>>=		Same as x = x >> 3
		x = 10;
		x >>= 3;
		System.out.println(x);

//	 	<<=		Same as x = x << 3
		x = 10;
		x <<= 3;
		System.out.println(x);

	}

}
