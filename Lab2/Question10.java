/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10 — Searching for a Number
 */

// Import file handling classes from java.io
import java.io.*;

// Import Scanner to read input from the user and numbers from the file
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) throws Exception {

        // Open numbers.txt and create a Scanner to read integers from the file
        Scanner console = new Scanner (new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\numbers.txt")));

       // Create a Scanner to read the number entered by the user 
        Scanner input = new Scanner(System.in);

        // Ask the user to enter the number they want to search for
        System.out.print("Please enter a number: ");

        // Store the number entered by the user
        int searchNumber = input.nextInt();

        // Assume the number is not in the file at the beginning
        boolean isAppearing = false;

        // Read every integer from numbers.txt until the number is found
        while(console.hasNextInt()){

            // Read the next number from the file
            int number = console.nextInt();

            // Check if the current number matches the number being searched for
            if(searchNumber == number) {

                // Change the result to true because the number was found
                isAppearing = true;

                // Stop searching once the number has been found
                break;
            }
        }
        
        // Display whether the number was found in numbers.txt
        System.out.print("The number " + searchNumber + " " + isAppearing + " in numbers.txt");

        // Close both Scanner objects
        input.close();
        console.close();
    }
    
}
