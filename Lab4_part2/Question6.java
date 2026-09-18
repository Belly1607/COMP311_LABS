package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6 — Finding the Smallest and Largest Values 
 */

public class Question6 {

    public static void main(String[] args) {

        //declare and initialize an integer array with twelve numbers
        int[] arr = new int[] {36, 12, 78, 5, 49, 91, 23, 64, 18, 57, 83, 29};

        //declare variables to store the largest and smallest values
        int largest, smallest;

        //assume the first value in the array is the largest
        largest = arr[0];

        //assume the first value in the array is the smallest
        smallest = arr[0];

        //use a for loop to go through each value in the array
        for (int i = 0; i < arr.length; i++) {

            //check if the current value is smaller than the stored smallest value
            if (arr[i] < smallest) {

                //update the smallest value
                smallest = arr[i];
            }

            //check if the current value is larger than the stored largest value
            if (arr[i] > largest) {

                //update the largest value
                largest = arr[i];
            }
        }

        //display the largest value
        System.out.println("Largest number: " + largest);

        //display the smallest value
        System.out.println("Smallest number: " + smallest);
    }
}