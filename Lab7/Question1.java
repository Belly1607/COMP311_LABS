package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 1: Reading a File
 */

//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        try {

            //create a File object for story.txt
            File f = new File("COMP311_LABS\\Lab7\\story.txt");

            //create a FileReader to read the file
            FileReader fr = new FileReader(f);

            //create a Scanner object to read the file contents
            Scanner console = new Scanner(fr);

            //display a heading
            System.out.println("The 5 lines of a story: ");

            //start counting lines from 1
            int i = 1;

            //read each line until there are no more lines
            while (console.hasNextLine()) {

                //display the line number and the line
                System.out.println("Line " + i + ": " + console.nextLine());

                //increase the line number
                i++;
            }

            //close the Scanner
            console.close();

        } catch (Exception e) {

            //display an error message if the file cannot be read
            System.out.println("File exception");
        }
    }
}
