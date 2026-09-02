/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3 : Reading Student Records from a File
 */

// import i.o package from java.io to read from a file
import java.io.*;

// import the scanner class to read a file
import java.util.Scanner;

public class Question3 {
    public static void main(String[]args) throws Exception {

        // scan the file to read the student records using the file path
        Scanner console = new Scanner(new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\students.txt")));

        //display the student records
        System.out.println("Student Records: ");

        while (console.hasNextLine()) {
            System.out.println("Name: "+ console.nextLine());
        }
        
    }
}
