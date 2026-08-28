/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 3
*/

//import scanner from java.util
        import java.util.* ;

public class Question3 {
    public static void main(String []args) {
        // declare scanner
        Scanner scan = new Scanner ( System.in);

        //print out a message to the user asking for their name
        System.out.print("Please enter your name: ");

        // declare a variable called name and it reads the name from the user
        String name = scan.nextLine();

        //print out a message to the user asking fot their age
        System.out.print("Please enter your age: ");

        // declare a variable called age and it reads the age from the user
        int age = scan.nextInt();

        //declare a variable called futureAge 
        int futureAge;

        //calculate the age of the user after 5 years
        futureAge = age + 5;

        // declare a string variable called sentence which reads the name and future age of the user
        String sentence = "Hello " + name + "! In five years, you will be " + futureAge + " years old.";
        
        //displays the sentence
        System.out.println(sentence);
    }

}