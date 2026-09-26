package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 2: Writing a File
 */

//import classes for file handling
import java.io.*;

public class Question2 {

    public static void main(String[] args) {

        try {

            //create a PrintWriter object to write to output.txt
            PrintWriter p = new PrintWriter("output.txt");

            //write the first and second lines
            p.println("Java is a programming language." + "\nI am learning how to write files.");

            //write the third and fourth lines
            p.println("PrintWriter can create a text file." + "\nEach println writes a new line.");

            //write the fifth line
            p.print("This is the final line.");

            //close the PrintWriter
            p.close();

        } catch (Exception e) {

            //display an error message if the file cannot be created
            System.out.print("File exception, file could not be created");
        }
    }
}
