package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7: For Loop — Multiplication Table 
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        
        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a number
        System.out.print("Please enter a number: ");

        //store the number entered by the user
        int number = console.nextInt();

        //declare a variable called total to store each multiplication result
        int total;

        //use a for loop to repeat from 1 up to 12
        for (int i = 1; i <= 12; i++){
            
            //multiply the entered number by the current value of i
            total = number * i;

            //display each line of the multiplication table
            System.out.println(number + " x "+ i + " = " + total); 
        }

        //close the Scanner     
          console.close();
    }
    
}
