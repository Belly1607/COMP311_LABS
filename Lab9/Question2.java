package COMP311_LABS.Lab9;
/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 2 — The super Keyword
 */

/*create a parent class called Vehicle
class Vehicle {

    //declare a private field to store the speed of the vehicle
    private int speed;

    //create a constructor to set the speed
    public Vehicle(int speed) {

        //initialize the speed field
        this.speed = speed;
    }

    //create a method to describe the vehicle
    public void describe() {

        //display the speed of the vehicle
        System.out.println("This is a vehicle with speed: " + speed + " km/hr");
    }
}
//create a subclass called Car that inherits from Vehicle
class Car extends Vehicle {

    //declare a private field to store the number of doors
    private int numberOfDoors;

    //create a constructor that receives the speed and number of doors
    public Car(int speed, int numberOfDoors) {

        //call the Vehicle constructor to set the speed
        super(speed);

        //initialize the numberOfDoors field
        this.numberOfDoors = numberOfDoors;
    }
}
*/
public class Question2 {

    public static void main(String[] args) {

        //create an instance of Car with speed 120 km/hr and 4 doors
        Car c1 = new Car(120, 4);

        //call the inherited describe method
        System.out.print("Car 1: ");
        c1.describe();
    }
}