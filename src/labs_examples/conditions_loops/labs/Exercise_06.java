package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Pick a number between 1 - 50:");
        a = scanner.nextInt();
        System.out.println("Pick a number beteen 1 - 50:");
        b = scanner.nextInt();

        int sum = a + b;
            System.out.println(sum);


    }
}
