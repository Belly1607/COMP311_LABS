package COMP311_LABS.Lab4;
/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 2 — Writing an Array to a File 
 */

// Import file handling classes from java.io
import java.io.*;
public class Question2 {
    public static void main(String[] args) {

        //use try-catch to handle possible file errors
        try{

            /*create a new file called numbers.txt
            * then create a PrintWriter to write values into the file
            */
            PrintWriter p = new PrintWriter(new File("numbers.txt"));

            //declare and initialize a double array with values
            double [] arr = {2.5,6.1,3.7,1.4,8.7,9.23,10.78,5.03};

            //use a for loop to go through every value in the array
            for (int i = 0; i < arr.length; i++){

                //write the current array value into numbers.txt
                 p.println(arr[i]);
            } 
            //close the PrintWriter after writing to the file
            p.close();

            //display a message to show that the array was successfully written to the file
            System.out.print("The array was successful written to the file");
        } catch (Exception e) {

            //display an error message if the file cannot be written
            System.out.print("File exception error could not write into file");
        }
    }
}
