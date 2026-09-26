package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 4 — Counting Lines
 */

//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read story.txt
            Scanner console = new Scanner(
                new FileReader("COMP311_LABS\\Lab7\\story.txt")
            );

            //initialize the line counter
            int line = 0;

            //read each line and count it
            while (console.hasNextLine()) {

                console.nextLine();
                line++;
            }

            //close the Scanner
            console.close();

            //display the total number of lines
            System.out.print("story.txt has " + line + " lines");

        } catch (Exception e) {

            //display an error message if the file cannot be read
            System.out.print("File exception");
        }
    }
}
