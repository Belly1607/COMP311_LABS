package COMP311_LABS.Lab3;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8: For Loop —  Counting Vowels
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        
        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a word or sentence
        System.out.print("Please enter a sentence: ");

        //store the sentence and convert it to lowercase
        String sentence = console.nextLine().toLowerCase();

        //declare and initialize a variable to count the vowels
        int vowelCount = 0;

        //use a for loop to go through each character in the sentence
        for (int i = 1; i < sentence.length();i++){

            //get the character at the current position
            char vowel = sentence.charAt(i);


            //check if the current character is a vowel
            if(vowel == 'a' ||vowel == 'e' ||vowel == 'i' ||vowel == 'o' ||vowel == 'u'){

                //increase the vowel counter by 1
                vowelCount++;
            }
            
        }

        //display the total number of vowels found in the sentence
        System.out.print("There are " + vowelCount + " vowels in your sentence");
        //close the Scanner     
          console.close();
    }
}
