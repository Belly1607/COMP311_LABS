package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 2 — Counting Tokens
 */

//import classes from the util package
import java.util.*;
public class Question2 {
    public static void main(String[] args) {

         //create a Scanner object for user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a sentence
        System.out.print("Please enter a sentence: ");

        //read the full sentence
        String sentence = console.nextLine();

        //close the Scanner
        console.close();

        //create a StringTokenizer to separate the sentence into words
        StringTokenizer st = new StringTokenizer(sentence, " ");

        //display the number of words in the sentence
        System.out.print("The sentence has " + st.countTokens() + " words");
    }
    
}
