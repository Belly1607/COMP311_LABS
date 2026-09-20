package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 6 — An Array of Objects
 */

public class Question6 {
    public static void main(String[] args) {

        //create the three Book objects with a title, author, and price with different details
        Book bk1 = new Book ("A Good Girl's Guide to Murder", "Holly Jackson", 12.98);
        Book bk2 = new Book("One of Us is Lying", "Karen M. McManus", 10.00);
        Book bk3 = new Book("The Inheritence Games", "Jennifer Lynn Barnes",9.99);

        //create an array called books that stores the three Book objects
        Book [] books = {bk1, bk2, bk3};

        //declare and initialize a counter to number each book
        int count = 1;

        //use an enhanced for loop to go through each Book object in the array
        for (Book book: books ){

            //display the book number
            System.out.println("Book " + count + " : ");

            //call getSummary() to display the title, author, and price of the current Book object
            System.out.println(book.getSummary());

            //print a blank line to separate the books
            System.out.println();

            //increase the book counter by 1
            count++;
        }
        }
}
