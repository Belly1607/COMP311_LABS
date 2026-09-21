package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8 — Method Overriding
 */

//create a class called Animal
public class Animal {

    //create a method called speak() that prints a generic animal message
    public void speak() {

        //display the generic animal sound message
        System.out.print("The animal makes a sound");
    }
}

//create a subclass called Cat that inherits from Animal
class Cat extends Animal {

    //override the speak() method from the Animal class
    @Override
    public void speak() {

        //display a cat-specific sound
        System.out.print("Meow");
    }
}