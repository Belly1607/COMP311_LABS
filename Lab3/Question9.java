package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9: For Loop —  Factorial 
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

    //create a Scanner object to read user input
    Scanner console = new Scanner(System.in);

    //ask the user to enter a whole number
    System.out.print("Enter a whole number: ");

    //store the number entered by the user
    int number = console.nextInt();

    //use a while loop to keep asking if the user enters a negative number
    while ( number < 0) {

        //display an error message and ask the user to enter another number
        System.out.print("Invalid number please enter a positive number: ");

        //store the new number entered by the user
        number = console.nextInt();
    } 

    //initialize factorial to 1 before starting the calculation
    int factorial = 1;

    //use a for loop to multiply all whole numbers from 1 up to the entered number
    for(int i = 1; i <= number; i++){

        //multiply factorial by the current value of i
        factorial *= i;
    }

    //display the final factorial result
    System.out.print(number + "! = " + factorial);
    
    //close the Scanner     
     console.close();
    }
    
    
}
