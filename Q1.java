package myFirstLab;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Constant multiplier for fertilizer to calculate crop index
        final int F_RATIO = 2;

        System.out.println("AgroTrack System");

        // Prompt the user to enter the farm name
        System.out.print("🌿 Please enter your farm's name: ");
        String farmName = sc.nextLine();  // Read farm name (String)

        // Prompt the user to enter rainfall in mm
        System.out.print("💦 Please enter today's rainfall in mm: ");
        float rainfall = sc.nextFloat();  // Read rainfall (float)

        // Prompt the user to enter fertilizer used in kg
        System.out.print("Please enter fertilizer quantity in kg: ");
        int fertilizer = sc.nextInt();    // Read fertilizer quantity (int)

        // Calculate crop index using the formula:
        // (fertilizer × F_RATIO) + integer part of rainfall
        int cropIndex = (fertilizer * F_RATIO) + (int) rainfall;

        // Initialize variable to store productivity classification
        String productivity;

        // Determine crop productivity category based on crop index
        if (cropIndex < 30) {
            productivity = "🔴 Low Productivity";  // If crop index is less than 30
        } else if (cropIndex <= 60) {
            productivity = "🟡 Moderate";          // If crop index is between 30 and 60
        } else {
            productivity = "🟢 High Yield";         // If crop index is greater than 60
        }

        // Check if crop index is even using bitwise AND operator
        boolean isEven = (cropIndex & 1) == 0;

        // Print the crop index along with whether it's even or odd
        System.out.println("\nCrop Index: " + cropIndex + (isEven ? " (Even)" : " (Odd)"));

        // Print the determined productivity level
        System.out.println(productivity);
    }
}
