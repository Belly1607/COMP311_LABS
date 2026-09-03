/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6: Switch Statement
 */

// Import Scanner to read input from the user
import java.util.Scanner;

public class Question6{
    public static void main(String[]args) {

        // Create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        // Ask the user to enter a number representing a day of the week
        System.out.print("Please enter a number: ");

        // Store the number entered by the user
        int day = console.nextInt();

        // Use a switch statement to match the number with the correct day
        switch(day) {

            // If the user enters 1, display Monday
            case 1:
                System.out.println("Monday");

                // Stop the switch here so the next cases do not run
                break;

            // If the user enters 2, display Tuesday
            case 2:
                System.out.println("Tuesday");
                break;
            
            // If the user enters 3, display Wednesday
            case 3:
                System.out.println("Wednesday");
                break;

            // If the user enters 4, display Thursday
            case 4:
                System.out.println("Thursday");
                break;

            // If the user enters 5, display Friday
            case 5:
                System.out.println("Friday");
                break;

            // If the user enters 6, display Saturday
            case 6:
                System.out.println("Saturday");
                break;

            // If the user enters 7, display Sunday
            case 7:
                System.out.println("Sunday");
                break;
            // Display an error message if the number is not between 1 and 7
            default:
                System.out.println("Invalid number");
                break;
        }

        // Close the Scanner after reading the input
        console.close();
    }
}