/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7 — File Statistics — Smallest, Largest and Average
 */

// Import file handling classes from java.io
import java.io.*;

// Import Scanner to read integers from the file
import java.util.Scanner;

public class Question7{
    public static void main(String []args) throws Exception {
        /*
        * Open numbers.txt and create a Scanner
        * to read the numbers from the file.
        */
        Scanner console = new Scanner (new File("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\numbers.txt"));

        /*
        * Create stats.txt and use PrintWriter
        * to write the results into the file.
       */
        PrintWriter p = new PrintWriter(new File ("stats.txt"));

        // Declare variables to store the largest and smallest numbers
        int largestNumber, smallestNumber;

        // Declare variables to store the total and average
        float average, total;

        // Read the first number from the file
        int firstNumber = console.nextInt();

        // Use the first number as the starting largest and smallest value
        largestNumber = firstNumber;

        smallestNumber = firstNumber;

        // Start the total with the first number
        total = firstNumber;

        // Start the counter at 1 because the first number has already been read
        int i = 1; 

        // Read the remaining integers in the file
        while(console.hasNextInt()) {

            // Read the next number
            int number = console.nextInt();

            // Check if the current number is larger than the current largest number
            if( number > largestNumber) {
                largestNumber = number;  
            } 

            // Check if the current number is smaller than the current smallest number
            else if (number < smallestNumber) {
                smallestNumber = number;   
            }

            // Add the current number to the total
            total += number;
            i++;
        }

        // Calculate the average of all the numbers
        average = total / i; 

        // Write the final statistics to stats.txt
        p.println("Largest Number: " + largestNumber);
        p.println("Smallest number: " + smallestNumber);
        p.print("Average: " + average);

        // Close the Scanner and PrintWriter
        console.close();
        p.close(); 
    }
}