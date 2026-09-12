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

        System.out.print("Please enter a sentence: ");
        String sentence = console.nextLine().toLowerCase();
        int vowelCount = 0;
        for (int i = 1; i < sentence.length();i++){
            char vowel = sentence.charAt(i);

            if(vowel == 'a' ||vowel == 'e' ||vowel == 'i' ||vowel == 'o' ||vowel == 'u'){
                vowelCount++;
            }
            
        }
        System.out.print(vowelCount);
        //close the Scanner     
          console.close();
    }
}
