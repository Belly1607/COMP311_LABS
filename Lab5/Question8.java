package COMP311_LABS.Lab5;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8 — Comparing Objects
 */

public class Question8 {
    public static void main(String[] args) {

        //create the two Book objects with a title, author, and price with different details
        Book bks1 = new Book("The Silent Patient", "Alex Michaelides",12.99);
        Book bks2 = new Book("Verity","Colleen Hoover",15.99);
        
        //call cheaperBook() and store the Book object with the lower price
        Book cheaper = cheaperBook(bks1, bks2);
        
        //display the summary of the cheaper Book
        System.out.print("Book which is cheaper is:\n" + cheaper.getSummary());

    }

    /* create a static method called cheaperBook that receives two Book objects
    *  the method returns the Book object with the lower price
    */
    public static Book cheaperBook(Book a, Book b){

        //compare the price of Book a with the price of Book b
        if (a.getPrice() < b.getPrice()) {

            //return Book a if its price is lower
            return a;
        }
        else {

            //return Book b if its price is lower or equal
            return b;
        }
    }
}
