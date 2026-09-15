package COMP311_LABS.Lab4;
/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 1: Reading Words into an Array
 */

// Import file handling classes from java.io
import java.io.*;

// Import Scanner to read data from the file
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // Use try-catch to handle possible file errors
        try {

            // Open names.txt and create a Scanner to read from the file
            Scanner console = new Scanner(new FileReader("COMP311_LABS/Lab4/names.txt"));

            // Create a String array called name with a capacity of 20
            String [] name = new String [20];

            // Create a counter to keep track of the array position
            int i = 0;  
        
            //Read names while the file has another line and while the array still has space 
            while((console.hasNextLine()) &&(i < 20)) {

                // Read the next name and store it in the current array position
                name[i] = console.nextLine();

                // Move to the next position in the array
                i++;
            }

            // Display a message after the names have been stored successfully
            System.out.print("The names have been successfully entered in an array");

            // Close the Scanner after reading the file
            console.close();
        }

        // Catch an error if the file cannot be found or opened
        catch (Exception e){

            // Display an error message
            System.out.print("File not found");
        }

    }
    
}
