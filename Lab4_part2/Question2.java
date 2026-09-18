package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 2 — Looping Through an Array with Index
 */

public class Question2 {
    public static void main(String[] args) {
        
        //declare and initialize a String array with five names
        String [] arr = {"Zaria", "Kairo", "Elowen", "Soren", "Nylah"};

        //use a for loop to go through each name in the array
        for(int i = 0; i < arr.length; i++){

            //display the index and the name stored at that index
            System.out.println("Index "+ i + " :" + arr[i]);
        }
    }
}
