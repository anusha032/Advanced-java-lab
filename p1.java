package lab1;

import java.util.*;

public class p1 {
    public static void main(String[] args) {

        // Creating ArrayList using List interface
        List<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("White");

        // Display all colors
        System.out.println(colors);

        // Searching for "Red"
        if (colors.contains("Red")) {
            System.out.println("available ");
        } else {
            System.out.println(" NOT available ");
        }
    }
}
