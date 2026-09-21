package COMP311_LABS.Lab6;


/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6 — Static vs Instance Methods
 */

public class Question6 {
    public static void main(String[] args) {

        //create a Calculator object called cal
        Calculator cal = new Calculator();

        //call the static add() method using the Calculator class and store the result
        int num1 = Calculator.add(23, 45);

         //call the instance multiply() method using the cal object and store the result
        int num2 = cal.multiply(14, 45);

        //display the addition result
        System.out.println("23 + 45 = " + num1);

        //display the multiplication result
        System.out.println("14 x 45 = " + num2);
    }
}
