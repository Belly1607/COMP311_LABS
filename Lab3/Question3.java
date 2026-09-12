/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3 — Even Numbers 
 */
package COMP311_LABS.Lab3;

public class Question3 {
    public static void main(String[] args) {

        //declare a variable called number and initialize it at 1
        int number = 1;

        //declare a variable called i and initialize it at 1 to count the even numbers
        int i = 1;

        //use the while loop to repeat while the number is less than or equal to 50
        while(number <= 50){

             //check if the current number is even
            if(number % 2 == 0) {

                //display the position and the even number
                System.out.println(i + " . " + number);

                //increase the counter by 1 after displaying an even number
                i++;
            }
            
            //increase the number by 1 after each loop            number++;

        }
    }
}
