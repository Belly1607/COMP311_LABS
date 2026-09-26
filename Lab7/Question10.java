package COMP311_LABS.Lab7;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 10 — Putting It Together
 */


//import classes for file handling
import java.io.*;

//import Scanner for reading the file
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        try {

            //create a Scanner object to read results.txt
            Scanner console = new Scanner(new FileReader("results.txt"));

            //create a PrintWriter object to write to passed.txt
            PrintWriter p = new PrintWriter("passed.txt");

            //read each line from results.txt
            while (console.hasNextLine()) {

                //read the next line
                String line = console.nextLine();

                //separate the name and score using the comma
                String[] parts = line.split(",");

                //store the student's name
                String name = parts[0];

                //convert the score from String to int
                int score = Integer.parseInt(parts[1]);

                //check if the student scored 50 or above
                if (score >= 50) {

                    //write the student to passed.txt
                    p.println(name + "," + score);
                }
            }

            //close the Scanner
            console.close();

            //close the PrintWriter
            p.close();

        } catch (Exception e) {

            //display an error message if a file error occurs
            System.out.println("File exception");
        }
    }
}
