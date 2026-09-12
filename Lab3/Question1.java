package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 1 : While Loop: countdown
 */

public class Question1 {
    public static void main(String[] args) {

        //declare an variable called number then initialize at 10 where the countdown starts 
        int number = 10;

        // use the while loop to repeat the number is greater than 0
        while(number > 0){

            // Display the current countdown number
            System.out.println(number);

            // Decrease the number by 1 after each loop
            number--;
        }

        // Display the final message after the countdown finishes
        System.out.print("Liftoff!");
    }
}
