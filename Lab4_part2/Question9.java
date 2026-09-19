package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9 — 2D Arrays — Row Totals
 */

public class Question9 {

    public static void main(String[] args) {

        //declare and initialize a 3 x 3 array of exam scores
        int[][] scores = {
            {78, 85, 91},
            {66, 74, 80},
            {88, 92, 84}
        };

        //use an outer loop to go through each student
        for (int i = 0; i < scores.length; i++) {

            //start the total for each student at 0
            int total = 0;

            //use an inner loop to go through each test score
            for (int j = 0; j < scores[i].length; j++) {

                //add each test score to the student's total
                total += scores[i][j];
            }

            //display the total score for each student
            System.out.println("Student " + (i + 1) + " total: " + total);
        }
    }
}