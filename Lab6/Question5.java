package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 5 — More Overloading Practice
 */

public class Question5 {

    public static void main(String[] args) {

        //declare and initialize a String variable to store the name
        String firstName = "Esabel";

        //declare and initialize an integer variable to store the age
        int age = 15;

        //call the displayInfo() method that accepts only a String name
        displayInfo(firstName);

        //call the overloaded displayInfo() method that accepts a name and age
        displayInfo(firstName, age);
    }

    //create an overloaded displayInfo() method that accepts only a name
    public static void displayInfo(String name) {

        //display the person's name
        System.out.println("Your name is " + name);
    }

    //create an overloaded displayInfo() method that accepts a name and age
    public static void displayInfo(String name, int age) {

        //display the person's name and age on separate lines
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}