package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6 : Do-While Loop — Running Total 
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //declare a variable called number to store each number entered by the user
        int number;

        //declare and initialize sum to 0 to store the running total
        int sum = 0;

        //use a do-while loop to keep asking the user for numbers
        do {

            //ask the user to enter a number
            System.out.print("Enter a number: ");

            //store the number entered by the user
            number = console.nextInt();

            //add the entered number to the running total
            sum += number;
        } 
        
        //repeat the loop while the entered number is not 0
        while(number != 0);

        //close the Scanner
        console.close();

        //display the final total after the loop ends
        System.out.print("Sum: "+ sum);
    }
}
