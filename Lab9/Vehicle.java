package COMP311_LABS.Lab9;
/*
* Name: Esabel Mutisi
* Student Id : 24020114
* Question 1 — Basic Inheritance
* Question 2 — The super Keyword
 */

//create a parent class called Vehicle
public class Vehicle {

    //declare a field to store the speed of the vehicle
    int speed;

    //create a constructor to set the speed
    public Vehicle(int speed){

        //initialize the speed field
        this.speed = speed;
    }

    //create a method to describe the vehicle
    public void describe(){

        //display the speed of the vehicle
        System.out.println("This is a vehicle with speed: " + speed + "km/hr");
    }
}
//create a subclass called Car that inherits from Vehicle
class Car extends Vehicle{

    //declare a field to store the number of doors
    int numberOfDoors;
    
    //create a constructor that receives the speed
     public Car(int speed,int numberOfDoors){

        //call the Vehicle constructor to set the speed
        super(speed);

        //initialize the numberOfDoors field
        this.numberOfDoors = numberOfDoors;
    }
    
}
