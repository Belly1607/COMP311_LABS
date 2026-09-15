package COMP311_LABS.Lab4;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 5 — Palindrome Check
 */

import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {

        //create a Scanner object to read user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a word or phrase
        System.out.print("Enter a word or phrase: ");

        //store the entered text 
        String palindrome = console.nextLine();

        //store the original text so that it can be compared with the reversed text
        String orgPalindrome = palindrome;
        
        //declare an empty String to store the reversed text
        String reverse="";

        //store the length of the entered text
        int len = palindrome.length();

        //use a for loop to move through the text from the last character to the first
        for (int i = len - 1; i >= 0; i--){

            //add each character to reverse to create the word backwards
            reverse = reverse + palindrome.charAt(i);
        }

        //close the Scanner
        console.close();

        //compare the original text with the reversed text
        if(orgPalindrome.equalsIgnoreCase(reverse)) {

            //display a message if the text is a palindrome
            System.out.println(orgPalindrome +" is a palindrome string");
        } else {

            //display a message if the text is not a palindrome
            System.out.println(orgPalindrome +" is not a palindrome string");
        }

    }
}
