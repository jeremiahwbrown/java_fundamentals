package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter any integer between -10000 and 10000: ");
        // assign input to variable as int
        int a;
        int b;
        a = scanner.nextInt();
        System.out.print("Enter any integer between -10000 and 10000: ");
        b = scanner.nextInt();
        int sum = a + b;
        if(sum<30000)
            System.out.println("the sum is:");
            System.out.println(sum);
        int mean = (a + b)/2;
        if(mean < 30000)
            System.out.println("the average is:");
            System.out.println(mean);
    }
}
