package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 1 — Creating a Class
 * Question 2 — Adding a Constructor
 * Question 3 — Creating Objects
 * Question 4 — Adding a Method
 * Question 5 — Encapsulation
 */

//create a class called Book
public class Book {

    //declare a private String field to store the title of the book
    private String title;

    //declare a private String field to store the author of the book
    private String author;

    //declare a private double field to store the price of the book
    private double price;

    //create a constructor that receives the title, author, and price
    //these values are used when a new Book object is created
    public Book(String title, String author, double price) {

        //assign the title parameter to the title field of this Book object
        this.title = title;

        //assign the author parameter to the author field of this Book object
        this.author = author;

        //assign the price parameter to the price field of this Book object
        this.price = price;
    }

    //create a getter method to return the title of the Book object
    public String getTitle() {
        return title;
    }

    //create a getter method to return the author of the Book object
    public String getAuthor() {
        return author;
    }

    //create a getter method to return the price of the Book object
    public double getPrice() {
        return price;
    }

    //create a method called getSummary() that returns the Book details as one String
    public String getSummary() {
        
        //return the title, author, and price on separate lines
        return "Title: " + title + "\n" + "Author: " + author + "\n" + "Price: " + price;
    }

    //create a setter method to change the title of the Book object
    public void setTitle(String title) {

        //assign the new title value to the title field
        this.title = title;
    }

    //create a setter method to change the author of the Book object
     public void setAuthor(String author) {

        //assign the new author value to the author field
        this.author = author;
    }
    
    //create a setter method to change the price of the Book object
     public void setPrice(double price) {

        //assign the new price value to the price field
        this.price = price;
    }
}