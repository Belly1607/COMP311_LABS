package COMP311_LABS.Lab8;

/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 6 — Simulating a Dice Roll
 */


public class Question6 {
    public static void main(String[] args) {

        /*
         * Math.random() generates a random decimal from 0.0 up to, but not including, 1.0.
         * I multiplied it by 6 because a die has six possible values.
         * I converted the result to an integer to remove the decimal part, which gave values from 0 to 5.
         * Then I added 1 so that the final range became 1 to 6.
         */
        System.out.print((int)(Math.random() * 6 + 1));
    }
}
