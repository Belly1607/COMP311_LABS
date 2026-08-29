/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a full name
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        // Find the position of the space between first name and surname
        int spaceIndex = fullName.indexOf(' ');

        // Split the full name into first name and surname
        String firstName = fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex + 1);

        // Build initials using the first letter of each part and uppercase them
        String initials = firstName.charAt(0) + "." + surname.charAt(0) + ".";
        initials = initials.toUpperCase();

        // Display the first name, surname, and initials
        System.out.println("First name: " + firstName);
        System.out.println("Surname: " + surname);
        System.out.println("Initials: " + initials);
    }
}