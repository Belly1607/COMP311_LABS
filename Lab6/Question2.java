package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 2 — A Method with a Return Value
 */

public class Question2 {

    public static void main(String[] args) {

        //declare and initialize an array with different circle radius values
        double[] circleRadius = new double[] {3.45, 4.67, 6.5, 8.913, 2.67, 5.71};

        //declare and initialize a counter to number each circle
        int count = 1;

        //use a for loop to go through each radius in the array
        for (int i = 0; i < circleRadius.length; i++) {

            //display the circle number
            System.out.println("Area of circle " + count);

            //display the formula and call circleArea() to calculate the area
            System.out.println("3.14 x " + circleRadius[i] + " x " + circleRadius[i]
                    + " = " + circleArea(circleRadius[i]));

            //increase the circle counter by 1
            count++;
        }
    }

    /** create a static method called circleArea that receives a radius
    *  the method returns the area of the circle as a double
    */
    public static double circleArea(double radius) {

        //calculate and return the area using pi x radius x radius
        return 3.14 * radius * radius;
    }
}