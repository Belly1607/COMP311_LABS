package COMP311_LABS.Lab3;
/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4 : Do-While Loop — Repeating Menu
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //declare a variable called number to store the user's menu choice
        int number;

        //use a do-while loop so that the menu is displayed at least once
        do{

            //display the menu options to the user
            System.out.println("1. Continue");
            System.out.println("2. Exit");

            //ask the user to enter their choice
            System.out.print("Please enter a choice between 1 and 2: ");

            //store the user's choice
            number = console.nextInt();
        } 
        //repeat the menu while the user has not entered 2
        while(number != 2);

        //close the Scanner
        console.close();
    }
}
