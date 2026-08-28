/**
 * NAME: Esabel Mutisi
 * STUDENT ID: 24020114
 * Question 5
 */

//import the Scanner class so that it can be used to get the user input
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){

        //declare a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        //declare two double variables named firstNumber and secondNumber
        double firstNumber, secondNumber;

        //declare five variables called sum, difference, product, quotient and remainder
        double sum, difference, product, quotient, remainder;

        //display a message to the user asking them to enter the first and second number
        System.out.print("Enter the first number: ");
        firstNumber = input.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = input.nextDouble();

        //calculate the sum, difference, product, quotient and remainder of the two numbers
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;
        remainder = firstNumber % secondNumber;

        //display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
}