package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3 — Creating Objects
 */

public class Question3 {
    public static void main(String[] args) {

        /* create the two Book objects called b1 and b2
        * the values are passed to the Book constructor in this order
        * title, author, price
        */
        Book b1 = new Book("Piranesi", "Susanna Clarke", 13.99);
        Book b2 = new Book("All the light we cannot see","Anthony Doerr",25.99); 
        
        /* create an array called books that stores the two Book objects
        * books[0] stores b1 and books[1] stores b2
        */
        Book [] books = {b1,b2};

        /* use an enhanced for loop to go through each Book object in the books array
        * during each loop, the current Book object is temporarily stored in the variable book
        */
        for (Book book : books) {

            //call getTitle() to get and display the title of the current Book object
            System.out.println("Title: " + book.getTitle());

            //call getAuthor() to get and display the author of the current Book object
            System.out.println("Author: " + book.getAuthor());

            //call getPrice() to get and display the price of the current Book object
            System.out.println("Price: " + book.getPrice());

            //print a blank line to separate one book from the next
            System.out.println();
        }
    }
}
