package COMP311_LABS.Lab9;
/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 1 — Basic Inheritance
 */

/* create a parent class called Vehicle
class Vehicle {

    // declare a field to store the speed of the vehicle as private so that it can be accessed by subclasses
    private int speed;

    // create a method to describe the vehicle
    public void describe() {

        // display the speed of the vehicle
        System.out.println("This is a vehicle with speed: " + speed + "km/hr");
    }
}

// create a subclass called Car that inherits from Vehicle
 class Car extends Vehicle {

    // declare a field to store the number of doors as private so that it can only be accessed within the Car class
    private int numberOfDoors;
}
*/
public class Question1 {
    public static void main(String[] args) {

        // create an instance of vehicle
        Vehicle v1 = new Vehicle(0);
        System.out.print("Vehicle 1: ");
        v1.describe();
    }
}
