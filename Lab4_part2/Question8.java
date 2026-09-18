package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8 — 2D Arrays — Declaring and Printing a Grid
 */

public class Question8 {
    public static void main(String[] args) {
        //declare and initialize a 3 x 3 two-dimensional integer array
        int [][] arr = new int[][] {{1,2,3},{4,5,6},{7,8,9}};

        //use an outer for loop to go through each row
        for(int i = 0; i < arr.length;i++) {

            //use an inner for loop to go through each column in the current row
            for(int j = 0; j < arr[i].length; j++) {

                //display each value followed by a space
                System.out.print(arr[i][j] + " ");
            }
            
            //move to a new line after printing each row
            System.out.println("");
        }
    }
}
