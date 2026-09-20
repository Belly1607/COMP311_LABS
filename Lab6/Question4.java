package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4 — Method Overloading
 */

public class Question4 {

    public static void main(String[] args) {

        //declare and initialize two integer values
        int number1 = 123, number2 = 342;

        //declare and initialize two double values
        double firstNum = 127.456, secondNum = 85.635;

        //declare and initialize two String values
        String firstString = "rain", secondString = "bow";

        //call the combine() method that accepts two integers
        combine(number1, number2);

        //call the combine() method that accepts two doubles
        combine(firstNum, secondNum);

        //call the combine() method that accepts two Strings
        combine(firstString, secondString);
    }

    //create an overloaded combine() method that accepts two integers
    public static void combine(int number1, int number2) {

        //add the two integer values and store the result
        int result = number1 + number2;

        //display the integer calculation and result
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    //create an overloaded combine() method that accepts two Strings
    public static void combine(String word1, String word2) {

        //join the two Strings together and display the result
        System.out.println(word1 + " + " + word2 + " = " + word1.concat(word2));
    }

    //create an overloaded combine() method that accepts two double values
    public static void combine(double firstNumber, double secondNumber) {

        //add the two double values and store the result
        double result = firstNumber + secondNumber;

        //display the double calculation and result
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
    }
}
