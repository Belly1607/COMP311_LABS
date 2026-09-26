package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 9 — Writing Name-Score Pairs 
 */

//import classes for file handling
import java.io.*;

//import Scanner for user input
import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        try {

            //create a Scanner object for user input
            Scanner input = new Scanner(System.in);

            //create a PrintWriter object to write to results.txt
            PrintWriter p = new PrintWriter("results.txt");

            //repeat for three students
            for (int i = 1; i <= 3; i++) {

                //ask for the student's name
                System.out.print("Enter student " + i + " name: ");
                String name = input.nextLine();

                //ask for the student's score
                System.out.print("Enter student " + i + " score: ");
                int score = input.nextInt();

                //clear the leftover newline
                input.nextLine();

                //write the name and score to the file
                p.println(name + "," + score);
            }

            //close the PrintWriter
            p.close();

            //close the Scanner
            input.close();

        } catch (Exception e) {

            //display an error message if the file cannot be created
            System.out.println("File exception");
        }
    }
}
