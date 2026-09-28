package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 8 — Overloaded Area Methods
 */

public class Question8 {

    public static void main(String[] args) {

        //calculate and display the area of a circle to 4 decimal places using printf
        System.out.printf("Area of a circle: %.4f%n", area(20.54));

        //calculate and display the area of a rectangle to 4 decimal places
        System.out.printf("Area of a rectangle: %.4f%n", area(12.4, 20.50));
    }

    //overloaded method to calculate the area of a circle
    public static double area(double radius) {

        //calculate the area using pi × radius × radius
        double result = Math.PI * radius * radius;

        //return the calculated area
        return result;
    }

    //overloaded method to calculate the area of a rectangle
    public static double area(double length, double width) {

        //calculate the area using length × width
        double result = length * width;

        //return the calculated area
        return result;
    }
}