package COMP311_LABS.Lab4_part2;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3 — Enhanced For Loop — Total and Average
 */

public class Question3 {
    public static void main(String[] args) {

        //declare and initialize a double array with exam scores
        double [] score = {67.5, 84.2, 53.8, 91.0, 76.4, 45.6, 88.9, 62.3, 39.7, 95.1, 71.8, 58.4, 83.6, 49.2, 90.5};

        //declare a variable to store the average score and total to 0
        double average, total = 0;
    
        //use an enhanced for loop to go through each score in the array and store each score in marks
        for(double marks : score){

            //add each score to the total
            total += marks;
        } 

        //calculate the average by dividing the total by the number of scores
        average = total / score.length;

        //display the total score
        System.out.println("Total: "+ total);

        //display the average score
        System.out.printf("Average score: %.3f" , average);
    }
}
