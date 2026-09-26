package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 5 — Counting Words
 */
//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read story.txt
            Scanner console = new Scanner(new FileReader("COMP311_LABS\\Lab7\\story.txt"));

            //initialize the word counter
            int words = 0;

            //read each word until there are no more words
            while (console.hasNext()) {

                //read the next word
                console.next();

                //increase the word counter
                words++;
            }

            //close the Scanner
            console.close();

            //display the total number of words
            System.out.print("There are " + words + " words");

        } catch (Exception e) {

            //display an error message if the file cannot be read
            System.out.print("File exception");
        }
    }
}