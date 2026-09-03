/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 5: Putting It All Together — Grade Report
 */

//Import the file package from java.io
import java.io.*;

//import the scanner to read from the user
import java.util.Scanner;

public class Question5{
    public static void main(String []arg) throws Exception {

        // scan the file to read the student records using the file path
        Scanner console = new Scanner(new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\students.txt")));

        // Create a PrintWriter to write the grade report into grades.txt
        PrintWriter p = new PrintWriter(new File("grades.txt"));

        // Declare a variable to store each student's letter grade 
        String grade;
        
        // Read each student record from students.txt one line at a time
        while(console.hasNextLine()) {
            
            // Read one complete student record
            String line = console.nextLine();

            // Split the line at the comma into name and score
            String[] parts = line.split(",");

            // Store the student's name and convert the score from String to int
            String studentName = parts[0]; 
            int studentScore = Integer.parseInt(parts[1]);
            
            // Make a conditional statement to determine the student's grade based on the score
            if (studentScore >= 80 && studentScore <= 100) {
                grade = "A";

                // Write the student's name, score, and grade to grades.txt
                p.println(studentName +"," + studentScore + "," + grade);
            }
            else if(studentScore >= 70 && studentScore <= 79) {
                grade = "B";

                // Write the student's name, score, and grade to grades.txt
                p.println(studentName +"," + studentScore + "," + grade);
            }
            else if (studentScore >= 60 && studentScore <= 69) {
                grade = "C";

                // Write the student's name, score, and grade to grades.txt
                p.println(studentName +"," + studentScore + "," + grade);
            }
            else if (studentScore >= 50 && studentScore <= 59) {
                grade = "D";

                // Write the student's name, score, and grade to grades.txt
                p.println(studentName +"," + studentScore + "," + grade);
            }
            else if (studentScore < 50) {
                grade = "F";

                // Write the student's name, score, and grade to grades.txt
                p.println(studentName +"," + studentScore + "," + grade);
            }
        }

        // Close the Scanner after reading the file
        console.close();

        // Close the PrintWriter to save all data to grades.txt
        p.close();

        // Inform the user that the grade report was created successfully
        System.out.println("You have successfully created a grades.txt file with student records");

    }
}