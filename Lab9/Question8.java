package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 8 — Using instanceof
 */

public class Question8 {
    public static void main(String [] args){

        //create a Vehicle array containing Car and Motorbike objects
        Vehicle [] vehicles = new Vehicle[]{ new Car(120,4),new Motorbike(100),new Car(200,2),new Car(100,2),new Motorbike(120),new Motorbike(150),new Motorbike(200)};

        //loop through every object in the Vehicle array
        for(int i = 0; i < vehicles.length; i++){

            //check if the current Vehicle object is a Car
           if(vehicles[i] instanceof Car){

            //display that the current object is a Car
            System.out.println("Vehicle " + (i+1) + " is a Car");

            //call the describe method for the Car object
            vehicles[i].describe();

            //print a blank line for spacing
            System.out.println();
           }

           //check if the current Vehicle object is a Motorbike
           else if(vehicles[i] instanceof Motorbike){

            //display that the current object is a Motorbike
            System.out.println("Vehicle " + (i+1) + " is a Motorbike");

            //call the describe method for the Motorbike object
            vehicles[i].describe();

            //print a blank line for spacing
            System.out.println();
           }
        }
    }
}
