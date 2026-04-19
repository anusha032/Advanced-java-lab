// * Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().

package lab3;

import java.util.Scanner;

public class p11 {
	// 1. Function to check if a string is empty or null
	public static boolean isNullOrEmpty(String str) {
	return str == null || str.trim().isEmpty();
	}

	public static void main(String[] args) {
	System.out.println("1. Is Empty: " + isNullOrEmpty(""));
	}

}