package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 9 — A Class That Uses Another Class
 */

//import the ArrayList class so Book objects can be stored in a dynamic list
import java.util.ArrayList;

//create a class called Library
public class Library {

    //declare a private ArrayList field to store Book objects
    private ArrayList<Book> books;

    //create a constructor for the Library class
    public Library(){

        //initialize the books ArrayList as an empty list
        books = new ArrayList<Book>();
    }
    
    //create a method called addBook that receives a Book object
    public void addBook(Book b){

        //add the Book object to the books ArrayList
        books.add(b);
    }
    
    //create a method called printAllBooks to display every Book in the library
    public void printAllBooks(){

        //use an enhanced for loop to go through each Book object in the books ArrayList
        for(Book book: books){

            //call getSummary() to display the details of the current Book object
            System.out.println(book.getSummary());
            //print a blank line after each summary
            System.out.println();
        }
    }
}
