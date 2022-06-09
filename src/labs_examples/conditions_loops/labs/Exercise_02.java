package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 and 7 to determine the corresponding day of the week: ");
        // assign input to variable as int
        int number = scanner.nextInt();
        if(number == 1)
            System.out.println("it is tuesday");
        if(number == 2)
            System.out.println("it is tuesday");
        if(number == 3)
            System.out.println("it is wednsday");
        if(number > 3)
            if(number < 5)
                System.out.println("it is thursday");
        if(number == 5)
            System.out.println("it is friday");
        if(number == 6)
            System.out.println("it is saturday");
        else
            System.out.println("it is sunday");


    }
}
