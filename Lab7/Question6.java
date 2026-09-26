package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question  6 — Copying a File
 */

//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read story.txt
            Scanner console = new Scanner(new FileReader("COMP311_LABS\\Lab7\\story.txt"));

            //create a PrintWriter object to write to story_copy.txt
            PrintWriter p = new PrintWriter("story_copy.txt");

            //read each line from story.txt
            while (console.hasNextLine()) {

                //write each line into story_copy.txt
                p.println(console.nextLine());
            }

            //close the Scanner
            console.close();

            //close the PrintWriter
            p.close();

        } catch (Exception e) {

            //display an error message if a file error occurs
            System.out.print("File exception");
        }
    }
}
