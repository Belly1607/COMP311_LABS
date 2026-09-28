package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 9 — Tokenizing and Averaging
 */

//import classes from the util package
import java.util.*;

public class Question9 {

    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter numbers separated by spaces
        System.out.print("Enter numbers: ");

        //read the full line entered by the user
        String sentence = console.nextLine();

        //create a StringTokenizer to separate the numbers using spaces
        StringTokenizer sTokens = new StringTokenizer(sentence, " ");

        //declare variables for the average and sum
        double average, sum = 0;

        //initialize a counter for the number of values
        int count = 0;

        //declare a variable to store each converted number
        double sentenceNumber;

        //check if there are more tokens
        while (sTokens.hasMoreTokens()) {

            //get the next token
            String token = sTokens.nextToken();

            //convert the token from String to double
            sentenceNumber = Double.parseDouble(token);

            //add the number to the total sum
            sum += sentenceNumber;

            //increase the number count
            count++;
        }

        //calculate the average
        average = sum / count;

        //display the average to 3 decimal places
        System.out.printf("Average: %.3f%n", average);

        //close the Scanner
        console.close();
    }
}