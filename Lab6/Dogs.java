package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9 — Overloading and Overriding Together
 */

//create a class called Dogs
public class Dogs {

    //create a method called bark() that returns a general dog sound message
    public String bark() {

        //return a String message about dogs barking
        return "Dogs can bark";
    }

    //create an overloaded getInfo() method with no parameters
    public void getInfo() {

        //display general information about dogs
        System.out.println("Dogs are the nicest mammals");
    }

    //create another overloaded getInfo() method that receives a breed
    public void getInfo(String breed) {

        //display information using the breed passed into the method
        System.out.println(breed + " is the cutest dog");
    }
}

//create a subclass called GoldenRetriever that inherits from Dogs
class GoldenRetriever extends Dogs {

    //override the bark() method from the Dogs class
    @Override
    public String bark() {

        //return a GoldenRetriever-specific bark sound
        return "Woof";
    }
}