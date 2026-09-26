package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question   8 — Summing Numbers from a File 
 */

//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read numbers.txt
            Scanner console = new Scanner(
                new FileReader("COMP311_LABS\\Lab7\\numbers.txt")
            );

            //initialize the total
            int total = 0;

            //read each integer from the file
            while (console.hasNextInt()) {

                //add each number to the total
                total += console.nextInt();
            }

            //close the Scanner
            console.close();

            //display the total
            System.out.println("Total: " + total);

        } catch (Exception e) {

            //display an error message if the file cannot be read
            System.out.println("File exception");
        }
    }
}
