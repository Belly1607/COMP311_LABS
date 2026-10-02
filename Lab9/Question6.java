package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 6 — Polymorphism with an Array
 * 
 * class Motorbike extends Vehicle {
     public Motorbike(int speed){
        super(speed);
     }
     @Override
     public void describe(){
        System.out.println("This is a motorbike with speed: " + speed + "km/hr");
     }

}
 */

public class Question6 {
    public static void main(String [] args){

        //create a Vehicle array containing Car and Motorbike objects
        Vehicle [] vehicles = new Vehicle[]{ new Car(120,4),new Motorbike(100),new Car(100,2),new Motorbike(120),new Motorbike(150)};

        //loop through every object in the Vehicle array
        for(int i = 0; i < vehicles.length; i++){

            //display the vehicle number
            System.out.println("Vehicle " + (i+1) + ":");

            //call the correct overridden describe method
            vehicles[i].describe();
        }
    }
}
