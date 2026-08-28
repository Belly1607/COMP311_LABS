/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6
 */

//import the Scanner class so that it can be used to get the user input
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){

        //declare a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        //declare three double variables named firstScore, secondScore and thirdScore
        double firstScore, secondScore, thirdScore;

        //declare a variable called average
        double average;

        //display a message to the user asking them to enter the first, second and third score
        System.out.print("Enter three score: ");
        firstScore = input.nextDouble();
        secondScore = input.nextDouble();
        thirdScore = input.nextDouble();

        //calculate the average of the three scores
        average = (firstScore + secondScore + thirdScore) / 3;

        //display the average
        System.out.println("Average: " + average);

    }
}
