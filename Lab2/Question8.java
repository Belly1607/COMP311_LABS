/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8 — Counting Evens and Odds
 */

// Import file handling classes
import java.io.*;

// Import Scanner to read numbers from the file
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) throws Exception {

        // Open numbers.txt and create a Scanner to read the integers
        Scanner input = new Scanner (new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\numbers.txt")));

        // Create evenodd.txt and a PrintWriter to write the results
        PrintWriter p = new PrintWriter(new File("evenodd.txt"));

        // Declare counters for even and odd numbers
        int countEven, countOdd;

        // Start both counters at zero
        countEven = 0;
        countOdd = 0;

        // Read every integer from numbers.txt
        while(input.hasNextInt()) {

            // Store the current number
            int number = input.nextInt();

            // Check whether the number is even or odd by looking at the remainder of the number when it is divided by 2
            if(number % 2 == 0) {

                // Increase the even counter
                countEven++;
            } else {

                // Increase the odd counter
                countOdd++;
            }
        }

        // Write the final even and odd counts to evenodd.txt
        p.println("There are "+ countEven + " even numbers");
        p.print("There are "+ countOdd + " odd numbers");

        // Close the Scanner and PrintWriter
        input.close();
        p.close();


    }

}
