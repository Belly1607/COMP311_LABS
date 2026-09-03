/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 8 — Counting Evens and Odds
 */

import java.io.*;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) throws Exception {

        
        Scanner input = new Scanner (new FileReader(("C:\\Users\\Acer\\OneDrive - biust.ac.bw\\Documents\\COMP311\\COMP311_LABS\\Lab2\\numbers.txt")));

        PrintWriter p = new PrintWriter(new File("evenodd.txt"));

        int countEven, countOdd;

        countEven = 0;
        countOdd = 0;

        while(input.hasNextInt()) {

            int number = input.nextInt();

            if(number % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        p.println("There are "+ countEven + " even numbers");
        p.print("There are "+ countOdd + " odd numbers");

        input.close();
        p.close();


    }

}
