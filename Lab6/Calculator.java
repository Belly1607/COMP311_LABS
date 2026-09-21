package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6 — Static vs Instance Methods
 */

//create a class called Calculator
public class Calculator {

    //declare a private instance field to count how many times multiply() is called
    private int callCount = 0;

    //create a static method called add() that receives two integers
    public static int add(int a, int b){

        //add the two numbers and return the result
        return a +  b;
    }

    //create an instance method called multiply() that receives two integers
    public  int multiply(int a, int b) {

        //increase callCount by 1 every time multiply() is called
        callCount++;

        //multiply the two numbers and return the result
        return a * b;
    }
}
