package COMP311_LABS.Lab4_part2;
/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 5 — Searching an Array
 */
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {

        //declare and initialize an integer array with ten numbers
        int [] arr = new int[] {14, 27, 63, 8, 45, 91, 32, 56, 19, 74};

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a number to search for
        System.out.print("Please enter a number: ");

        //store the number entered by the user
        int searchNum = console.nextInt();

        //close the Scanner
        console.close();

        //use a for loop to go through each number in the array
        for(int i = 0; i < arr.length;i++){
          
            //check if the entered number matches the number at the current index
            if (searchNum == arr[i]) {

                //display the number and the index where it was found
                System.out.print(searchNum + " is in the array in at index " + i);

                //stop the program once the number is found
                return;
            }
        }
        //display a message if the number was not found in the array
        System.out.print(searchNum + " is not in the array ");
        
    }
}
