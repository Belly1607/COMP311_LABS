package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 1 — Basic StringTokenizer
 */

//import classes from the util package
import java.util.*;

public class Question1 {

    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner console = new Scanner(System.in);

        //ask the user to enter a sentence
        System.out.print("Please enter a sentence: ");

        //read the full sentence entered by the user
        String sentence = console.nextLine();

        //create a StringTokenizer to separate the sentence into words
        StringTokenizer st = new StringTokenizer(sentence, " ");

        //close the Scanner
        console.close();

        //check if there are more words
        while (st.hasMoreTokens()) {

            //print each word on its own line
            System.out.println(st.nextToken());
        }
    }
}
