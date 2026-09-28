package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 7 — Rounding Numbers
 */

//import classes from the util package
import java.util.*;

public class Question7 {

    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner console = new Scanner(System.in);

        //create a counter to number the inputs
        int count = 1;

        //repeat the process 5 times
        for (int i = 0; i < 5; i++) {

            //ask the user to enter a decimal number
            System.out.print("Enter a number " + count + " : ");

            //read the decimal number
            float number = console.nextFloat();

            //round the number to the nearest whole number and display it
            System.out.println("Rounded number " + count + " : " + Math.round(number));

            //increase the counter
            count++;
        }

        //close the Scanner
        console.close();
    }
}
