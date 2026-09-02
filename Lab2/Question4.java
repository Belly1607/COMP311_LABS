/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4 : Writing Results to a File
 */

//import the File package from java.io
import java.io.*;

// import the Scanner to read from the user
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) throws Exception {

        // create a file called results.txt 
        File f = new File("results.txt");

        // declare a scanner so that the user can write in the file
        Scanner input = new Scanner(System.in);

        //prompt the user to write five student names and scores
        System.out.println("Please enter five student names and scores: ");

        /** * create a file called results.txt using  new File("results.txt")
         * create a printWriter so that the user can write to the file
         */
        
        PrintWriter p = new PrintWriter(new File("results.txt"));

        //use a for loop to write the five student names and scores
        for (int i = 0; i < 5; i++) {

            //display to the user to prompt a student name
            System.out.print("Student name  " + (i + 1) + ":");

            //reads the user's name using a scanner
            String studentName = input.nextLine();

            //display to the user to prompt a student score
            System.out.print("Student score " + (i + 1) + ":");

            //reads the user's score using a scanner
            int studentScore = input.nextInt();

            //student name and score are written in results.txt and are seperated by a coma
            p.println(studentName + "," + studentScore);

            // consume the newline character left by nextInt()
            input.nextLine();
        }
        p.close();
        input.close();

        //tells the user that have successfully placed text in the results.txt
        System.out.println("You have successfully placed text in results.txt file");
        

    }
}