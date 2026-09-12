package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 5 : Do-While Loop — Validating Input 
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //declare a variable called number to store the user's input
        int number;

        //use a do-while loop to keep asking until a valid number is entered
        do {

            //ask the user to enter a number between 1 and 10
            System.out.print("Please enter a number between 1 to 10: ");

            //store the number entered by the user
            number = console.nextInt();
        } 
        //repeat the loop while the number is not between 1 and 10
        while (!(number >= 1 && number <= 10));

         //close the Scanner
        console.close();
    }
}
