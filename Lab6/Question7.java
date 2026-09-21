package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7 — Pass by Value
 */

public class Question7 {
    public static void main(String[] args) {

        //declare and initialize an integer variable
        int value = 1537;

        //call tryToDouble() and pass the value into the method
        tryToDouble(value);

        //display the original variable to show that it has not changed
        System.out.println("The number is " + value);
    }

    //create a void method called tryToDouble that receives an integer parameter
    public static void tryToDouble(int number) {

        //double the value of the parameter inside the method
        number = number * 2;
    }
}
