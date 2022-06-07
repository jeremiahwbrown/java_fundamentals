package labs_examples.fundamentals.labs;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        int s = 5;

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int c = str.indexOf('!');
        int a = str.length();


        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        boolean strEqual = true;

        if(str.length() == str2.length()) System.out.println(" \"hello\" is equal to \"hello!\" ");
        else {
            System.out.println(" \"hello\" is not equal to \"hello!\"");
        }


        // please concatenate str & str2 and set the result to a new String variable below

        String str3  = "hello!" + "hello";

        int b = str3.length();

        System.out.println("the value of str = 6 and the value of str2 = 5");

        






        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc



    }


}
