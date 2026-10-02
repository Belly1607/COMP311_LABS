package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 5 — Overriding toString()

  override the toString method to return a readable summary of the Car object
    @Override 
    public String toString(){

        //return the car's speed and number of doors as a String
        return "Car speed: " + speed + "\nNumber of doors: " + numberOfDoors;
    }
 */

public class Question5 {

    public static void main(String[] args) {

        //create a Car object with speed 120 km/hr and 4 doors
        Car myCar = new Car(120, 4);

        //print the Car object directly java automatically calls the overridden toString() method
        System.out.println(myCar);
    }
}
