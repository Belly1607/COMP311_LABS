package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 4 — Adding a Method
 */

public class Question4 {
    public static void main(String[] args) {
         /* create the two Book objects called b1 and b2
        * the values are passed to the Book constructor in this order
        * title, author, price
        */
        Book b1 = new Book("Piranesi", "Susanna Clarke", 13.99);
        Book b2 = new Book("All the light we cannot see","Anthony Doerr",25.99); 
        
        //display a heading for the first book
        System.out.println("Book 1: ");
        
        //call getSummary() to get and display all details of the first Book object
        System.out.println(b1.getSummary());
        
        //print a blank line to separate the two books
        System.out.println();

        //display a heading for the second book
        System.out.println("Book 2:");

        //call getSummary() to get and display all details of the second Book object
        System.out.print(b2.getSummary());
        
    }
}
