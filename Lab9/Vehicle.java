package COMP311_LABS.Lab9;

/*
 * Question 1 - Basic Inheritance
 * Question 2 - The super Keyword
 * Question 3 - Overriding a Method
 * Question 4 - Using protected Fields
 * Question 5 — Overriding toString()
 */

// create a parent class called Vehicle
public class Vehicle {
    // declare a field to store the speed of the vehicle as protected so that it can be accessed by subclasses
    protected int speed;

    // create a constructor to set the speed
    public Vehicle(int speed) {
        // initialize the speed field
        this.speed = speed;
    }

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

    // create a constructor that receives the speed
    public Car(int speed, int numberOfDoors) {
        // call the Vehicle constructor to set the speed
        super(speed);
        // initialize the numberOfDoors field
        this.numberOfDoors = numberOfDoors;
    }

    // override the describe method inherited from Vehicle
    @Override
    public void describe() {
        // display the number of doors and the speed of the car
        System.out.println("Number of doors: " + numberOfDoors + "\n" + "it's speed is: " + speed + "km/hr");
    }

    // create a method that directly accesses the protected speed field
    public void displaySpeed() {
        // display the speed of the car
        System.out.println("The speed of the car is: " + speed + "km/hr");
    }

    //override the toString method to return a readable summary of the Car object
    @Override 
    public String toString(){

        //return the car's speed and number of doors as a String
        return "Car speed: " + speed + "\nNumber of doors: " + numberOfDoors;
    }
}
