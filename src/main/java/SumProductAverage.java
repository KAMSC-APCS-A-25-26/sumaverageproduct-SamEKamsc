/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;
// NAME                  :   Sam Edmonds
// GROUP                 :   APCS-A
// LAST MODIFIED         :   9/9/25
// PROBLEM ID            :   Lewis 2.2-2.3
// PROBLEM DESCRIPTION   :   This program runs an inputted
//                       :   number of times and takes in three
//                       :   numbers and returns their average
// SOURCES I USED        :   Mr. Houtrouw, Mr. Afsal
// PEOPLE I HELPED       :   n/a
// PEOPLE WHO HELPED ME  :   Mr. Houtrouw, Mr. Afsal

import java.util.Scanner;

public class SumProductAverage {
    public static void main(String[] args) {
        // Create Scanner
        Scanner sc = new Scanner(System.in);

        // Signature
        System.out.println("Sam Edmonds\nAPCS-A\nLewis 2.2-2.3\n\n");

        // Prompts, reads, and runs an inputted amount
        System.out.print("How many times would you like to run the program?  ");
        int numRuns = sc.nextInt();
        System.out.println("\n");
        for (int i = 0; i < numRuns; i++) {
            // Asks for three numbers, then defines and inputs them
            System.out.print("Enter three numbers:  ");
            double num1 = sc.nextDouble(), num2 = sc.nextDouble(), num3 = sc.nextDouble();
            System.out.println();

            // Outputs the sum, product, and average
            System.out.println("sum: " + (num1 + num2 + num3));
            System.out.println("product: " + (num1 * num2 * num3));
            System.out.println("average: " + ((num1 + num2 + num3) / 3) + "\n");
        }
    }
}
