package lab3;
import java.util.*;

public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "AIET";
        String s2 = new String("College");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        // 2. Length and Character Access
        System.out.println("\nLength of s1: " + s1.length());
        System.out.println("Character at index 2 in s1: " + s1.charAt(2));

        // 3. String Comparison
        String s3 = "aiet";
        System.out.println("\nEquals: " + s1.equals(s3));
        System.out.println("Equals Ignore Case: " + s1.equalsIgnoreCase(s3));
        System.out.println("CompareTo: " + s1.compareTo(s3));

        // 4. String Searching
        String text = "Welcome to AIET College";
        System.out.println("\nIndex of 'AIET': " + text.indexOf("AIET"));
        System.out.println("Contains 'College': " + text.contains("College"));

        // 5. Substring Operations
        System.out.println("\nSubstring (11 to 15): " + text.substring(11, 15));

        // 6. String Modification
        System.out.println("\nReplace AIET with XYZ: " + text.replace("AIET", "XYZ"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String str = "   Java Programming   ";
        System.out.println("\nBefore Trim: '" + str + "'");
        System.out.println("After Trim: '" + str.trim() + "'");

        // 8. String Concatenation
        String result = s1 + " " + s2;
        System.out.println("\nConcatenated String: " + result);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("\nSplitting String:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" Engineering");
        sb.insert(5, "College ");
        sb.replace(0, 4, "Welcome");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "Anusha";
        int marks = 90;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "student@aiet.edu";

        if (email.contains("@") &&
            email.startsWith("student") &&
            email.endsWith(".edu")) {
            System.out.println("\nEmail is valid.");
        } else {
            System.out.println("\nEmail is invalid.");
        }
    }
}