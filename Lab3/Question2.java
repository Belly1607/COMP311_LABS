package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 2 — Sum of Numbers
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        // Ask the user to enter a positive whole number
        System.out.print("Enter a positive number: ");

        // Store the number entered by the user
        int number = console.nextInt();

        // Store the running total, starting at 0
        int sum = 0;

        // use the while look to keep adding the current number until the condition is false
        while(number >= 1) {

             // Add the current number to the total
            sum += number;

            // Decrease the number by 1
            number--;
        } 

        // Close the Scanner
        console.close();

        // Display the final sum
        System.out.print("Sum: " + sum);
    }
}
