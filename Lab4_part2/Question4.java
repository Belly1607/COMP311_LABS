package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4 — Sorting an Array
 */

// Import the Arrays class to sort and display the array
import java.util.Arrays;
public class Question4 {
    public static void main(String[] args) {

        //declare and initialize an integer array with eight unsorted numbers
        int [] arr = new int [] {58,7,45,28,86,11,45,2};

        //sort the array from smallest to largest
        Arrays.sort(arr);

        //display the sorted array using Arrays.toString()
        System.out.print("Sorted array: " + Arrays.toString(arr));
    }
}
