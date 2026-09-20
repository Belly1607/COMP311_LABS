package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 10 — Putting It Together
 */

public class Question10 {

    public static void main(String[] args) {

        //create a Library object called lib1
        Library lib1 = new Library();

        //create the first Book object with a title, author, and price
        Book b1 = new Book("The girl on the train", "Paula Hawkins", 12.50);

        //create the second Book object with different details
        Book b2 = new Book("Picnic at Hanging Rock", "Joan Linsday", 10.10);

        //create the third Book object with different details
        Book b3 = new Book("In the woods", "Tana French", 8.99);

        //create the fourth Book object with different details
        Book b4 = new Book("The Haunting of Hill House", "Shirley Jackson", 5.34);

        //create an array called bk that stores the four Book objects
        Book[] bk = {b1, b2, b3, b4};

        //use an enhanced for loop to go through each Book object in the array
        for (Book book : bk) {

            //add the current Book object to the Library
            lib1.addBook(book);
        }

        //display all the Book objects currently stored in the Library
        lib1.printAllBooks();
    }
}