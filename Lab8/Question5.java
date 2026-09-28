package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 5 — Largest and Smallest
 */
//import classes from the util package
import java.util.*;

public class Question5 {

    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //ask the user to enter three numbers
        System.out.println("Please enter three numbers: ");

        //declare variables for the three numbers
        int num1, num2, num3;

        //ask for the first number
        System.out.print("Number 1: ");
        num1 = input.nextInt();

        //ask for the second number
        System.out.print("Number 2: ");
        num2 = input.nextInt();

        //ask for the third number
        System.out.print("Number 3: ");
        num3 = input.nextInt();

        //close the Scanner
        input.close();

        //find and display the largest number
        System.out.println(
            "Largest Number: " + Math.max(num1, Math.max(num2, num3))
        );

        //find and display the smallest number
        System.out.println(
            "Smallest Number: " + Math.min(num1, Math.min(num2, num3))
        );
    }
}

