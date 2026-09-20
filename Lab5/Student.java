package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7 — A Second Class
 */

//create a class called Student
public class Student {

    //declare a private String, integer and double field to store the student's name, age and GPA
    private String name;
    private int age;
    private double gpa;

    //create a constructor that receives the name, age, and GPA
    public Student(String name, int age, double gpa) {

        //assign the name parameter to the name field of this Student object
        this.name = name;

        //assign the age parameter to the age field of this Student object
        this.age = age;

        //assign the GPA parameter to the GPA field of this Student object
        this.gpa = gpa;
    } 

    //create a getter method to return the student's name
    public String getName() {
        return name;
    }

     //create a getter method to return the student's age
    public int getAge() {
        return age;
    }

    //create a getter method to return the student's GPA
    public double getGpa() {
        return gpa;
    }

}
