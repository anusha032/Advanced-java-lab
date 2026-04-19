//* Write a Java Program for Reversing the characters in a string using user defined function reverseString().


package lab3;
import java.util.Scanner;

public class p13 {
	// 3. Function to reverse a string
	public static String reverseString(String str) {
	if (str == null) {
	return null;
	}
	return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
	System.out.println("3. Reverse: " + reverseString("hello"));
	}
}
