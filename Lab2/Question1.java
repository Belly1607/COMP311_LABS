/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 1 : Grading with Conditionals
 */

//Import the scanner so that it can read user input
import java.util.Scanner;

public class Question1{
    public static void main(String[]args){

        // declare a scanner object to read user input 
        Scanner console = new Scanner(System.in);

        //prompt the user to enter a  numeric score
        System.out.print("Enter a mark: ");

        //declare a variable mark to store the user input
        float mark = console.nextFloat();

        //place a condition if the mark is in between 0 and 100
        if (mark >= 0 && mark <= 100) {

            //place a condition to check if mark is above 80 and print grade A
            if (mark >= 80) {
                System.out.println("Grade : A");
            }
            //place a condition to check if mark is between 70 and 79 and print grade B
            else if (mark >= 70) {
                System.out.println("Grade : B");
            }
            //place a condition to check if mark is between 60 and 69 and print grade C
            else if (mark >= 60) {
                System.out.println("Grade : C");
            }
            //place a condition to check if mark is between 50 and 59 and print grade D
            else if (mark >= 50) {
                System.out.println("Grade : D");
            }
            //place a condition to check if mark is below 50
            else {
                System.out.println("Grade : F");
            }
        } else {
            // Display an error message if the mark is out of bounds
            System.out.println("Error: Please enter a mark between 0 and 100");
        }
    }
}