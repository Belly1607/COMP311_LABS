package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 3 — Handling a Missing File
 */

//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.*;

public class Question3 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read missing.txt
            Scanner input = new Scanner(new FileReader("COMP311_LABS\\Lab7\\missing.txt"));

            //read and display each line if the file exists
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }

            //close the Scanner
            input.close();

        } catch (Exception e) {

            //display a friendly message if the file does not exist
            System.out.print("File not found. Please check the file name.");
        }
    }
}
