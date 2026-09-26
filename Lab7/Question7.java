package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 7 — Appending to a File 
 */

//import classes for file handling
import java.io.*;

public class Question7 {

    public static void main(String[] args) {

        try {

            //open output.txt in append mode
            FileWriter fw = new FileWriter("output.txt", true);

            //create a PrintWriter to write to the file
            PrintWriter p = new PrintWriter(fw);

            //add two new lines to the end of the file
            p.println("This is the sixth line.");
            p.println("This is the seventh line.");

            //close the PrintWriter
            p.close();

        } catch (Exception e) {

            //display an error message if the file cannot be written to
            System.out.print("File exception");
        }
    }
}
