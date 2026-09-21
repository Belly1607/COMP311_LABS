package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10 — Putting It Together
 */

//import the Scanner class to read user input
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter the rectangle length
        System.out.print("Enter length: ");

        //store the entered length
        double length = console.nextDouble();

        //ask the user to enter the rectangle width
        System.out.print("Enter width: ");

        //store the entered width
        double width = console.nextDouble();

        //close the Scanner
        console.close();

        //call the static perimeter() method using the Rectangle class
        Rectangle.perimeter(length, width);

        //call the static area() method using the Rectangle class
        Rectangle.area(length, width);
    }
}
