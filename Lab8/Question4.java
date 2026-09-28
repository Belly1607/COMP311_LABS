package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 3 — Custom Delimiters
 */

//import Scanner for user input
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        //create a Scanner object
        Scanner sc = new Scanner(System.in);

        //declare a variable to store the number
        int number;

        //ask the user to enter a number
        System.out.print("Enter a number: ");

        //read the number entered by the user
        number = sc.nextInt();

        //display the square root of the number
        System.out.println(number + " square root = " + Math.sqrt(number));

        //display the square of the number
        System.out.println(number + " squared = " + Math.pow(number, 2));

        //display the cube of the number
        System.out.println(number + " cubed = " + Math.pow(number, 3));

        //close the Scanner
        sc.close();
    }
}
