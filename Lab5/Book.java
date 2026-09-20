package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 1 — Creating a Class
 * Question 2 — Adding a Constructor
 * Question 3 — Creating Objects
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
}