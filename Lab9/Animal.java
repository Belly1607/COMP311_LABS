package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 10 — Putting It Together — a Zoo
 */

//create a parent class called Animal
public class Animal {

    //create a method that describes the sound made by an animal
    public void makeSound() {

        //display a general animal sound message
        System.out.println("Animal makes a sound");
    }
}

//create a Dog subclass that inherits from Animal
class Dog extends Animal {

    //override the makeSound method inherited from Animal
    @Override
    public void makeSound() {

        //display the sound made by a dog
        System.out.println("Dog barks");
    }
}

//create a Cat subclass that inherits from Animal
class Cat extends Animal {

    //override the makeSound method inherited from Animal
    @Override
    public void makeSound() {

        //display the sound made by a cat
        System.out.println("Cat meows");
    }
}

//create a Bird subclass that inherits from Animal
class Bird extends Animal {

    //override the makeSound method inherited from Animal
    @Override
    public void makeSound() {

        //display the sound made by a bird
        System.out.println("Bird chirps");
    }
}