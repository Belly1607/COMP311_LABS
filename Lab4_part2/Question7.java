package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7 — Counting Occurrences
 */

import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        //declare and initialize an integer array with repeated values
        int[] arr = new int[] {12, 7, 25, 12, 40, 7, 18, 12, 33, 7, 25, 50};

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a value
        System.out.print("Enter a value: ");

        //store the value entered by the user
        int value = console.nextInt();

        //declare and initialize a counter to 0
        int count = 0;

        //close the Scanner
        console.close();

        //use a for loop to go through each value in the array
        for (int i = 0; i < arr.length; i++) {

            //check if the current array value matches the user's value
            if (arr[i] == value) {

                //increase the count by 1 when a match is found
                count++;
            }
        }

        //display how many times the value appears in the array
        System.out.print("Count: " + count);
    }
}