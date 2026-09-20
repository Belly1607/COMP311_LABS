package COMP311_LABS.Lab6;

/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3 — void vs Returning Methods
 */

public class Question3 {

    //main method where the program starts running
    public static void main(String[] args) {

        //call the printBanner() method to display the decorative line
        printBanner();
    }

    //create a static method called getBanner() that returns the banner as a String
    public static String getBanner() {

        //return the decorative line
        return "******** JAVA PROGRAM <<<<Question 3>>>>> ********";
    }

    //create a static void method called printBanner()
    //this method prints the banner returned by getBanner()
    public static void printBanner() {

        //call getBanner() and display the returned String
        System.out.print(getBanner());
    }
}
