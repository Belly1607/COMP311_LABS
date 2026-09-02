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

        // Read the full name input from the user 
        String fullName = input.nextLine();

        //Place the full name to uppercase and lowercase
        String fullNameUpperCase = fullName.toUpperCase();
        String fullNameLowerCase = fullName.toLowerCase();

        //find the length of the full name
        int fullNameLength = fullName.length();

        //Prompt the user to place a letter
        System.out.print("Please enter the letter: ");
        String letter = input.next().toUpperCase();

        // declare a boolean variable to check if the letter is equal to the first letter of the full name
        boolean isEqual = fullNameUpperCase.startsWith(letter);

        // Display the results
        System.out.println("Full name: " + fullName);
        System.out.println("Full name with uppercase letters: " + fullNameUpperCase);
        System.out.println("Full name with lowercase letters: " + fullNameLowerCase);
        System.out.println("Length of full name: " + fullNameLength);
        System.out.println("First letter of full name: " + fullName.charAt(0));
        System.out.println("Letter entered: " + letter);
        System.out.println("The letter " + letter + " is " + isEqual + " to the first letter of the full name.");
        
        input.close();

    }
}