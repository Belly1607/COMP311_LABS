package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10 — Why Arrays Have a Fixed Size 
 */
import java.util.Arrays;

public class Question10 {

    public static void main(String[] args) {

        //declare and initialize an integer array with five values
        int[] numbers = {10, 20, 30, 40, 50};

        //create a new larger array because Java arrays have a fixed size
        numbers = Arrays.copyOf(numbers, 6);

        //add the sixth value at index 5
        numbers[5] = 60;

        //display the new array
        System.out.println(Arrays.toString(numbers));
    }
}
