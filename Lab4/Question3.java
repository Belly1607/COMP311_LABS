package COMP311_LABS.Lab4;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 3 — Sum, Smallest and Largest — Written to a File
 */
// Import file handling classes from java.io
import java.io.*;
public class Question3 {
    public static void main(String[] args) {

        //use try-catch to handle possible file errors
        try{

            //create a new file and a PrintWriter to write the results into it
            PrintWriter p = new PrintWriter(new File("integer_numbers.txt"));

            //declare and initialize an integer array with values
            int [] arr ={12,56,76,34,68,12,35,73,79,87,45};

            //declare and initialize sum to 0
            int sum = 0;

            //declare variables to store the largest and smallest numbers
            int largest, smallest;

            //use the first array value as the starting largest number
            largest = arr[0];

            //use the first array value as the starting smallest number
            smallest = arr[0];

            //use a for loop to go through every value in the array
            for( int i = 0; i < arr.length; i++) {

                //add the current array value to the total sum
                sum += arr[i];

                //check if the current value is greater than the largest number
                if(arr[i] > largest) {

                    //update the largest number
                    largest = arr[i];
                } 
                //check if the current value is smaller than the smallest number
                if (arr[i] < smallest) {

                    //update the smallest number
                    smallest = arr[i];
                }
            }

            //write the sum into the file
            p.println("Sum: " + sum);

            //write the largest number into the file
            p.println("Largest number: " + largest);
        
            //write the smallest number into the file
            p.print("Smallest number: " + smallest);

            //close the PrintWriter after writing to the file
            p.close();

            //display a message to show that the results were written successfully
            System.out.print("The sum, largest number, and smallest number were successfully written to the file");
            
        } catch (Exception e ) {

            //display an error message if the file cannot be written
            System.out.print("File exception error could not write into file");
        }
        
        

    }
}
