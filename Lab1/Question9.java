/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9
 */

// import the scanner from java.util package to get user input
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        // declare Scanner to get user input
        Scanner scan = new Scanner(System.in);

        // display a message to the user asking for a sentence
        System.out.print("Enter a sentence: ");

        // read the full sentence from the user
        String sentence = scan.nextLine();

        // calculate the sentence length
        int length = sentence.length();

        // convert the sentence to uppercase and lowercase
        String uppercase = sentence.toUpperCase();
        String lowercase = sentence.toLowerCase();

        // check whether the sentence contains the word "Java"
        boolean containsJava = sentence.contains("Java");

        // print the results
        System.out.println("Length: " + length);
        System.out.println("Upper case: " + uppercase);
        System.out.println("Lower case: " + lowercase);
        System.out.println("Contains \"Java\": " + containsJava);
    }
}