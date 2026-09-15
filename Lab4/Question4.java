package COMP311_LABS.Lab4;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 4 — Decimal to Binary 
 */

// Import Scanner to read data from the file
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //create an integer array to store the binary digits
        int [] binary = new int [100];

        //ask the user to enter a whole number
        System.out.print("Please enter a number: ");

        //store the number entered by the user
        int binaryNumber = console.nextInt();

        //close the Scanner after reading the input
        console.close();

        //create a counter to keep track of the array position
        int i = 0;

        //check if the entered number is 0
        if (binaryNumber == 0) {

            //display 0 because the binary representation of 0 is 0
            System.out.print("The binary number is: 0");

            //stop the program after displaying the result
            return;
        } else {

            //repeat the conversion while the number is not 0
            while(binaryNumber != 0) {

                //find the remainder after dividing the number by 2 and store it in the array
                binary[i] = binaryNumber % 2;

                //divide the number by 2
                binaryNumber /= 2;

                //move to the next position in the array
                i++;
            }
        }
        //display a message before printing the binary number
       System.out.print("The binary number is: ");

       //use a for loop to print the binary digits in reverse order
        for (int j = i - 1 ;j >= 0 ; j-- ){

            //display each binary digit
            System.out.print(""+binary[j]);
        }
    }
}
