/**
 * Name: Esabel Mutisi
 * Student ID: 24020114
 * Question 7 — File Statistics — Smallest, Largest and Average
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

        p.write("There are "+ countEven + " even numbers");
        p.write("There are "+ countOdd + " odd numbers");

        input.close();
        p.close();


    }

}
