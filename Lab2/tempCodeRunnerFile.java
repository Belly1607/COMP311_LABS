/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 2: Working with strings
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question2 {
    public static void main(String[]args) {

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full name
        System.out.print("Please enter your full name: ");

        // Read the full name input from the user and convert it to uppercase
        String fullName = input.nextLine().toUpperCase();

        //find the length of the full name
        int fullNameLength = fullName.length();

        //Prompt the user to place a letter
        System.out.print("Please enter the letter: ");
        char letter = input.next().toUpperCase();

        //compare the letter with the first letter of the full name
        if(letter equals(fullName.charAt(0))) {
            boolean isEqual = true;
        } else {
            boolean isEqual = false;
        }

        // Display the results
        System.out.println("Full name: " + fullName);
        System.out.println("Length of full name: " + fullNameLength);
        System.out.println("First letter of full name: " + fullName.charAt(0));
        System.out.println(" letter entered: " + letter);
        System.out.println("The letter " + letter + "is " + isEqual + " to the first letter of the full name.");
        

    }
}