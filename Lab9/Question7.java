package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 7 — Runtime Polymorphism
 */

public class Question7 {

    public static void main(String[] args) {

        //create a Vehicle reference pointing to a Car object
        Vehicle v1 = new Car(140, 4);

        //create a Vehicle reference pointing to a Motorbike object
        Vehicle v2 = new Motorbike(160);

        //call the overridden describe method for the Car object
        v1.describe();

        //call the overridden describe method for the Motorbike object
        v2.describe();
    }
}
