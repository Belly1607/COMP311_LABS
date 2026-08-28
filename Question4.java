/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4
*/

//import scanner from java.until
import java.util.Scanner;

public class Question4 {
    public static void main(String[]args){
        // declare scanner
        Scanner scan = new Scanner(System.in);

        //print out a message to the user asking for a whole number
        System.out.print("Enter a whole number: ");

        // declare a variable called number and it reads the whole number from the user
        int number = scan.nextInt();

        //print out a message to the user asking for a decimal number
        System.out.print("Enter a decimal number: ");

        // declare a variable called decimalNumber and it reads the decimal number from the user
        float decimalNumber = scan.nextFloat();

        //print out a message to the user asking for a single word
        System.out.print("Enter a single word: ");

        //declare variable called word and it reads the single word
        String word = scan.next();

        //declare sentence and assign it a combination of the three variables entered by the user
        String sentence = "You entered " + number +", " + decimalNumber + ", and the word " + word + ".";

        //display sentence
        System.out.println(sentence);
    }
}