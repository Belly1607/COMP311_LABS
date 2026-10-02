package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 9 — Three Subclasses, One Method
 */

public class Question9 {
    public static void main(String[] args) {
        // create an array of Vehicle objects
        Vehicle[] vehicles = new Vehicle[] {
            new Truck(80),
            new Motorbike(60),
            new Car(120,2)
        };
        int count = 1;
        // iterate through the array and call the describe method on each object
        for(Vehicle vehicle: vehicles){

            // display the vehicle number and call the describe method
            System.out.println("Vehicle " + count + ":");

            // call the describe method on the current vehicle object
            vehicle.describe();

            // increment the count for the next vehicle
            count++;
        }
    }
}
