/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7
 */

//import Scanner class to get user input
import java.util.Scanner;

public class Question7{
    public static void main(String[] args){

        //declare a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        //declare a variable called celsiusTemperature that reads the temperature in Celsius from the user
        double celsiusTemperature;

        //declare a variable called fahrenheitTemperature that will hold the converted temperature in Fahrenheit
        double fahrenheitTemperature;

        //display a message to the user asking them to enter the temperature in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        celsiusTemperature = input.nextDouble();

        //calculate the temperature in Fahrenheit using the formula (°C × 9/5) + 32
        fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;

        // Display both the Celsius and Fahrenheit temperatures
        System.out.println(celsiusTemperature + " degrees Celsius is "+ fahrenheitTemperature + " degrees Fahrenheit.");
        
    }
}