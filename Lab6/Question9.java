package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9 — Overloading and Overriding Together
 */

public class Question9 {

    public static void main(String[] args) {

        Dogs dog = new Dogs();

        //display the bark() result from the Dogs class
        System.out.println(dog.bark());

        //call the overloaded getInfo() method with no parameter
        dog.getInfo();

        //call the overloaded getInfo() method with a String parameter
        dog.getInfo("Kuvasz");

        //create a GoldenRetriever object using the Dogs reference type
        Dogs dogs = new GoldenRetriever();

        //display the overridden bark() method from GoldenRetriever
        System.out.println(dogs.bark());
    }
}