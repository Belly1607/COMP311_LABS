/*
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8
 */

//import the scanner from java.util package to get user input
import java.util.Scanner;

public class Question8 {
    public static void main(String[]args) {

        //declare Scanner to get user input
        Scanner input = new Scanner(System.in);

        //declare two variables called length and width
        double length, width;

        //display a message to the user asking for the length of the rectangle
        System.out.print("Enter the length: ");
        length = input.nextDouble();

        //print a message to the user asking for the width of the rectangle
        System.out.print("Enter the width: ");
        width = input.nextDouble();

        //declare variables perimeter and area 
        double perimeter, area;

        //calculate the perimeter by the formula 2 * (length + width)
        perimeter = 2 * (length + width);

        //calculate the area by the formula length * width
        area = length * width;

        //print the area perimeter of the rectangle
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        input.close();
    }
}