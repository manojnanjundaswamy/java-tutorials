package com.manojnanjundaswamy.javatutorial.datatypes;

/**
 * <h2>Java Type Casting</h2>
 * <p>
 * Type casting is when you assign a value of one primitive data type to another
 * type.
 * </p>
 * <p>
 * In Java, there are two types of casting:
 * </p>
 * <ul>
 * <li><strong>Widening Casting</strong> (automatically) - converting a smaller
 * type to a larger type size<br>
 * <code class="codespan">byte</code> -&gt; <code class="codespan">short</code>
 * -&gt; <code class="codespan">char</code> -&gt;
 * <code class="codespan">int</code> -&gt; <code class="codespan">long</code>
 * -&gt; <code class="codespan">float</code> -&gt;
 * <code class="codespan">double</code><br>
 * <br>
 * </li>
 * <li><strong>Narrowing Casting</strong> (manually) - converting a larger type
 * to a smaller size type<br>
 * <code class="codespan">double</code> -&gt;
 * <code class="codespan">float</code> -&gt; <code class="codespan">long</code>
 * -&gt; <code class="codespan">int</code> -&gt;
 * <code class="codespan">char</code> -&gt; <code class="codespan">short</code>
 * -&gt; <code class="codespan">byte</code></li>
 * </ul>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class TypeCasting {

	public static void main(String[] args) {
//		Widening casting is done automatically when passing a smaller size type to a larger size type:
		int myInt = 9;
		double myDouble = myInt; // Automatic casting: int to double
		System.out.println(myInt); // Outputs 9
		System.out.println(myDouble); // Outputs 9.0

//		Narrowing casting must be done manually by placing the type in parentheses in front of the value:
		double myDouble2 = 9.78d;
		int myInt2 = (int) myDouble2; // Manual casting: double to int
		System.out.println(myDouble2); // Outputs 9.78
		System.out.println(myInt2); // Outputs 9
	}

}
