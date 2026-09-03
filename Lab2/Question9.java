/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9 — Summing Positives and Negatives
 */

// Import file handling classes from java.io
import java.io.*;

// Import Scanner to read integers from the file
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) throws Exception {
        
        // Open numbers.txt and create a Scanner to read the integers
        Scanner console = new Scanner (new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\numbers.txt")));

        // Create signs.txt and a PrintWriter to write the results
        PrintWriter p = new PrintWriter("signs.txt");

        // Declare variables to store the totals and counts
        int totalPositiveNumber, totalNegativeNumber, countNegative, countPositive ;

        // Start all totals and counters at zero
        totalNegativeNumber = 0;
        totalPositiveNumber = 0;
        countNegative = 0;
        countPositive = 0;

        while(console.hasNextInt()) {

            // Store the current number
            int number = console.nextInt();

            /*
            *If the number is positive, add it to the positive total
            *and increase the positive counter
             */ 
            if (number > 0) {
                totalPositiveNumber += number;
                countPositive++;
            } 
            
            /*
            *If the number is negative, add it to the negative total
            *and increase the negative counter
             */ 
             
            if(number < 0 ) {
                totalNegativeNumber += number;
                countNegative++;
            }
            
        }

        // Write the positive and negative totals and counts to signs.txt
        p.println("Total negative numbers are " + totalNegativeNumber + "  in the numbers file");
        p.println("Total positive numbers are " + totalPositiveNumber + "  in the numbers file");
        p.println("There are " + countPositive + " positive numbers in the numbers file");
        p.println("There are " + countNegative + " negative numbers in the numbers file");

        // Close the Scanner and PrintWriter
        console.close();
        p.close();
    }
}
