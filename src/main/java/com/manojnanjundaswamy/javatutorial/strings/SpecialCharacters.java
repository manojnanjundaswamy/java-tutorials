package com.manojnanjundaswamy.javatutorial.strings;

/**
 * <p>
 * Because strings must be written within quotes, Java will misunderstand this
 * string, and generate an error:
 * </p>
 * <p>
 * The solution to avoid this problem, is to use the <strong>backslash escape
 * character</strong>.
 * </p>
 * <p>
 * The backslash (<code>\</code>) escape character turns special characters into
 * string characters:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>Escape character</th>
 * <th>Result</th>
 * <th>Description</th>
 * </tr>
 * <tr>
 * <td>\'</td>
 * <td>'</td>
 * <td>Single quote</td>
 * </tr>
 * <tr>
 * <td>\"</td>
 * <td>"</td>
 * <td>Double quote</td>
 * </tr>
 * <tr>
 * <td>\\</td>
 * <td>\</td>
 * <td>Backslash</td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * <p>
 * Other common escape sequences that are valid in Java are:
 * </p>
 * <table>
 * <tbody>
 * <tr>
 * <th>Code</th>
 * <th>Result</th>
 * </tr>
 * <tr>
 * <td>\n</td>
 * <td>New Line</td>
 * </tr>
 * <tr>
 * <td>\r</td>
 * <td>Carriage Return</td>
 * </tr>
 * <tr>
 * <td>\t</td>
 * <td>Tab</td>
 * </tr>
 * <tr>
 * <td>\b</td>
 * <td>Backspace</td>
 * </tr>
 * <tr>
 * <td>\f</td>
 * <td>Form Feed</td>
 * <td></td>
 * </tr>
 * </tbody>
 * </table>
 * 
 * @author Manoj Nanjundaswamy
 *
 */
public class SpecialCharacters {

	public static void main(String[] args) {
//		The sequence \"  inserts a double quote in a string:
		System.out.println("We are the so-called \"Vikings\" from the north.");

//		The sequence \'  inserts a single quote in a string:
		System.out.println("It\'s alright.");

//		The sequence \\  inserts a single backslash in a string:
		System.out.println("The character \\ is called backslash.");

	}

}
