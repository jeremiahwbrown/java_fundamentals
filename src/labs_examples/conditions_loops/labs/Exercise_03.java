package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a month to determine its placement calander: ");

        String month;

        month = scanner.nextLine();

        switch(month){
            case("January"):
                System.out.println("1");
                break;
            case "February":
                System.out.println("2");
                break;
            case "March":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
                break;
            case "May":
                System.out.println("5");
                break;
            case "June":
                System.out.println("6");
                break;
            case "July":
                System.out.println("7");
                break;
            case "August":
                System.out.println("8");
                break;
            case "September":
                System.out.println("9");
                break;
            case "October":
                System.out.println("10");
                break;
            case "November":
                System.out.println("11");
                break;
            case "December":
                System.out.println("12");
                break;
            default:
                System.out.println("learn to read directions");
                break;
        }
    }
}













