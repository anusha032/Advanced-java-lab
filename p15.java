//* Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()

package lab3;

import java.util.Scanner;

public class p15 {

	// 5. Function to remove all whitespace from a string
	public static String removeWhitespace(String str) {
	return str == null ? null : str.replaceAll("\\s", "");
	}

	public static void main(String[] args) {
	System.out.println("5. Remove Whitespace: " + removeWhitespace("Hello World"));
	}
}