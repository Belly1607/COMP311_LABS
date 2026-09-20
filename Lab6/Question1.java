package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 1 — Creating a Method
 */

public class Question1 {
    //main method where the program starts running
    public static void main(String[] args) {

        //declare and initialize an integer variable
        int number = 123438;

        //call the isEven() method and display the returned result
        System.out.print("IsEven: " + isEven(number));
    }

    /* create a static method called isEven that receives an integer n
    * the method returns true if the number is even and false if it is odd
    */
    public static boolean isEven(int n) {

        //check if the number has no remainder when divided by 2
        if ((n % 2) == 0) {

            //return true if the number is even
            return true;
        } else {

            //return false if the number is odd
            return false;
        }
    }
}
