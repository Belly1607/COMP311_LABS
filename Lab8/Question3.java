package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 3 — Custom Delimiters
 */

//import Scanner and StringTokenizer
import java.util.*;

public class Question3 {
    public static void main(String[] args) {

        //create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        //ask the user to enter fruits separated by commas
        System.out.print("Please enter a list of fruits with commas: ");

        //read the full list of fruits
        String fruitList = input.nextLine();

        //close the Scanner
        input.close();

        //create a StringTokenizer using comma as the delimiter
        StringTokenizer sToken = new StringTokenizer(fruitList,",");

        //check if there are more fruits
        while (sToken.hasMoreTokens()) {

            //print each fruit on its own line
            System.out.println(sToken.nextToken());
            
        }
    }
}
