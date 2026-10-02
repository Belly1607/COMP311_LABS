package COMP311_LABS.Lab9;

/**
 * Name: Esabel Mutisi
 * Student Id: 24020114
 * Question 10 — Putting It Together — a Zoo
 */

public class Question10 {
    public static void main(String[] args) {
        // create an array of Animal objects
        Animal[] animals = new Animal[] {new Dog(),new Cat(),new Bird()};
        int count = 1;
        // iterate through the array and call the makeSound method on each object
        for(Animal animal: animals){

            // display the animal number and call the makeSound method
            System.out.println("Animal " + count + ":");

            // call the makeSound method on the current animal object
            animal.makeSound();

            // increment the count for the next animal
            count++;
        }
    }
}
