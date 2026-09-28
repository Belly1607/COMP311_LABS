package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 10 — Putting It Together
 */

//import classes from the util package
import java.util.*;

public class Question10 {
    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter the operation and two numbers
        System.out.print("Enter operation,num1,num2 in that format: ");

        //read the full input
        String sentence = console.nextLine();

        //create a StringTokenizer using comma as the delimiter
        StringTokenizer sTokens = new StringTokenizer(sentence, ",");

        //get the operation
        String operation = sTokens.nextToken();

        //get and convert the first number to double
        double num1 = Double.parseDouble(sTokens.nextToken());

        //get and convert the second number to double
        double num2 = Double.parseDouble(sTokens.nextToken());

        //declare a variable to store the result
        double result;

        //use a switch statement to check the operation
        switch (operation) {

            //add the two numbers
            case "add":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            //subtract the second number from the first number
            case "subtract":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            //multiply the two numbers
            case "multiply":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            //divide the first number by the second number
            case "divide":

                //check that the second number is not zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;

            //display a message if the operation is invalid
            default:
                System.out.println("Invalid operation");
        }

        //close the Scanner
        console.close();
    }
}
