package com.manojnanjundaswamy.javatutorial.strings;

/**
 * <p>
 * Strings are used for storing text.
 * </p>
 * <p>
 * A <code>String</code> variable contains a collection of
 * characters surrounded by double quotes:
 * </p>
 * <p>
 * A String in Java is actually an object, which contain methods that can
 * perform certain operations on strings.<br> Bellow are the methods String obj consist
 * </p>
 * <table style="margin:0">
  <tbody><tr>
    <th style="width:22%;text-align:left">Method</th>
    <th style="width:62%;text-align:left">Description</th>
    <th style="width:16%;text-align:left">Return Type</th>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_charat.asp">charAt()</a></td>
    <td>Returns the character at the specified index (position)</td>
    <td>char</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_codepointat.asp">codePointAt()</a></td>
    <td>Returns the Unicode of the character at the specified index</td>
    <td>int</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_codepointbefore.asp">codePointBefore()</a></td>
    <td>Returns the Unicode of the character before the specified index</td>
    <td>int</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_codepointcount.asp">codePointCount()</a></td>
    <td>Returns the number of Unicode values found in a string.</td>
    <td>int</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_compareto.asp">compareTo()</a></td>
    <td>Compares two strings lexicographically</td>
    <td>int</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_comparetoignorecase.asp">compareToIgnoreCase()</a></td>
    <td>Compares two strings lexicographically, ignoring case differences</td>
     <td>int</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_concat.asp">concat()</a></td>
    <td>Appends a string to the end of another string</td>
    <td>String</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_contains.asp">contains()</a></td>
    <td>Checks whether a string contains a sequence of characters</td>
    <td>boolean</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_contentequals.asp">contentEquals()</a></td>
    <td>Checks whether a string contains the exact same sequence of characters 
    of the specified CharSequence or StringBuffer</td>
    <td>boolean</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_copyvalueof.asp">copyValueOf()</a></td>
    <td>Returns a String that represents the characters of the character array</td>
     <td>String</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_endswith.asp">endsWith()</a></td>
    <td>Checks whether a string ends with the specified character(s)</td>
     <td>boolean</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_equals.asp">equals()</a></td>
    <td>Compares two strings. Returns true if the strings are equal, and false 
    if not</td>
    <td>boolean</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_equalsignorecase.asp">equalsIgnoreCase()</a></td>
    <td>Compares two strings, ignoring case considerations</td>
     <td>boolean</td>
 </tr>
  <tr>
    <td>format()</td>
    <td>Returns a formatted string using the specified locale, format string, and arguments</td>
     <td>String</td>
 </tr>
  <tr>
    <td>getBytes()</td>
    <td>Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array</td>
     <td>byte[]</td>
 </tr>
  <tr>
    <td>getChars()</td>
    <td>Copies characters from a string to an array of chars</td>
     <td>void</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_hashcode.asp">hashCode()</a></td>
    <td>Returns the hash code of a string</td>
      <td>int</td>
</tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_indexof.asp">indexOf()</a></td>
   <td>Returns the position of the first found occurrence of specified characters in a string</td>
      <td>int</td>
 </tr>
  <tr>
    <td>intern()</td>
    <td>Returns the canonical representation for the string object</td>
     <td>String</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_isempty.asp">isEmpty()</a></td>
   <td>Checks whether a string is empty or not</td>
      <td>boolean</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_lastindexof.asp">lastIndexOf()</a></td>
    <td>Returns the position of the last found occurrence of specified characters in a string</td>
     <td>int</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_length.asp">length()</a></td>
    <td>Returns the length of a specified string</td>
    <td>int</td>
 </tr>
  <tr>
    <td>matches()</td>
    <td>Searches a string for a match against a regular expression, and returns the matches</td>
    <td>boolean</td>
 </tr>
  <tr>
    <td>offsetByCodePoints()</td>
    <td>Returns the index within this String that is offset from the given index by codePointOffset code points</td>
    <td>int</td>
  </tr>
  <tr>
    <td>regionMatches()</td>
   <td>Tests if two string regions are equal</td>
     <td>boolean</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_replace.asp">replace()</a></td>
    <td>Searches a string for a specified value, and returns a new string where the specified values are replaced</td>
    <td>String</td>
  </tr>
  <tr>
    <td>replaceFirst()</td>
   <td>Replaces the first occurrence of a substring that matches the given regular expression with the given replacement</td>
    <td>String</td>
 </tr>
  <tr>
    <td>replaceAll()</td>
   <td>Replaces each substring of this string that matches the given regular expression with the given replacement</td>
    <td>String</td>
 </tr>
 <tr>
    <td>split()</td>
   <td>Splits a string into an array of substrings</td>
    <td>String[]</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_startswith.asp">startsWith()</a></td>
    <td>Checks whether a string starts with specified characters</td>
    <td>boolean</td>
 </tr>
  <tr>
    <td>subSequence()</td>
   <td>Returns a new character sequence that is a subsequence of this sequence</td>
    <td>CharSequence</td>
 </tr>
  <tr>
    <td>substring()</td>
  <td>Returns a new string which is the substring of a specified string</td>
    <td>String</td>
  </tr>
  <tr>
    <td>toCharArray()</td>
    <td>Converts this string to a new character array</td>
    <td>char[]</td>
  </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_tolowercase.asp">toLowerCase()</a></td>
    <td>Converts a string to lower case letters</td>
     <td>String</td>
 </tr>
  <tr>
    <td>toString()</td>
   <td>Returns the value of a String object</td>
      <td>String</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_touppercase.asp">toUpperCase()</a></td>
   <td>Converts a string to upper case letters</td>
      <td>String</td>
 </tr>
  <tr>
    <td><a href="https://www.w3schools.com/java/ref_string_trim.asp">trim()</a></td>
    <td>Removes whitespace from both ends of a string</td>
    <td>String</td>
  </tr>
  <tr>
    <td>valueOf()</td>
    <td>Returns the string representation of the specified value</td>
    <td>String</td>
  </tr>
</tbody>
</table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class Strings {

	public static void main(String[] args) {
//		Create a variable of type String and assign it a value:
		String greeting = "Hello";

//		Using String length() method to get length of txt string: Outputs 26
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());

		String txt2 = "Hello World";
//		Using String toUpperCase() method: Outputs "HELLO WORLD"
		System.out.println(txt2.toUpperCase());
//		Using String toUpperCase() method: Outputs "hello world"
		System.out.println(txt2.toLowerCase());

		
//		Using String indexOf() method: Outputs 7
		String txt3 = "Please locate where 'locate' occurs!";
		System.out.println(txt3.indexOf("locate")); // Outputs 7
	}

}
