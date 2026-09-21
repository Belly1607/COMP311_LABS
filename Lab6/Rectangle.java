package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10 — Putting It Together
 */

//create a class called Rectangle
public class Rectangle {

    //create a static method called area() that receives length and width
    public static void area(double length, double width) {

        //calculate the area by multiplying length by width
        double result = length * width;

        //display the area calculation and result
        System.out.println("Area: " + length + " x " + width + " = " + result);
    }

    //create a static method called perimeter() that receives length and width
    public static void perimeter(double length, double width) {

        //calculate the perimeter using the formula (length + width) x 2
        double result = (length + width) * 2;

        //display the perimeter calculation and result
        System.out.println("Perimeter: (" + length + " + " + width + ") x 2 = " + result);
    }
}
