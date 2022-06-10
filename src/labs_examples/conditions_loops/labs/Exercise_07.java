package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println("enter a word containing at least one vowel:");
        Scanner scanner = new Scanner(System.in);

        String str;
        str = scanner.nextLine();
        System.out.println(str);
        if((str.indexOf("a") > 0) && (str.indexOf("a") < str.indexOf("e")) && (str.indexOf("a") < str.indexOf("i")) && (str.indexOf("a") < str.indexOf("o")) && (str.indexOf("a") < str.indexOf("u")))
            System.out.println("a");
        else if ( (str.indexOf("e") > 0) && (str.indexOf("e") < str.indexOf("a")) && (str.indexOf("e") < str.indexOf("i")) && (str.indexOf("e") < str.indexOf("o")) && (str.indexOf("e") < str.indexOf("u")))
            System.out.println("e");
        else if ( (str.indexOf("o") > 0) && (str.indexOf("o") < str.indexOf("a")) && (str.indexOf("o") < str.indexOf("i")) && (str.indexOf("o") < str.indexOf("e")) && (str.indexOf("o") < str.indexOf("u")))
            System.out.println("o");
        else if ((str.indexOf("u") > 0) && (str.indexOf("u") < str.indexOf("e")) && (str.indexOf("u") < str.indexOf("i")) && (str.indexOf("u") < str.indexOf("o")) && (str.indexOf("u") < str.indexOf("a")))
            System.out.println("u");
        else if (((str.indexOf("i") > 0) && (str.indexOf("i") < str.indexOf("e")) && (str.indexOf("i") < str.indexOf("o")) && (str.indexOf("i") < str.indexOf("u")) && (str.indexOf("i") < str.indexOf("a"))))
            System.out.println("i");
        }

    }




