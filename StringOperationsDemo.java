// * 2 a. Develop a java program for performing various string operations with different string handling functions directed as follows
// * String Creation and Basic Operations, Length and Character Access, String Comparison, String Searching, Substring Operations , String Modification, Whitespace Handling, 
// * String Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and startsWith() and endsWith()

package lab2;
import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str3));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Programming': " + text.indexOf("Programming"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("\nSubstring (5 to 16): " + text.substring(5, 16));

        // 6. String Modification
        System.out.println("\nReplace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("To UpperCase: " + text.toUpperCase());
        System.out.println("To LowerCase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String str4 = "   Welcome to Java   ";
        System.out.println("\nBefore Trim: '" + str4 + "'");
        System.out.println("After Trim: '" + str4.trim() + "'");

        // 8. String Concatenation
        String result = str1 + " " + str2;
        System.out.println("\nConcatenated String: " + result);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("\nSplitting String:");
        for (String fruit : arr) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.replace(0, 4, "Advanced");
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "Anusha";
        int marks = 95;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "example@gmail.com";

        if (email.contains("@") &&
            email.startsWith("example") &&
            email.endsWith(".com")) {
            System.out.println("\nEmail is valid.");
        } else {
            System.out.println("\nEmail is invalid.");
        }
    }
}
