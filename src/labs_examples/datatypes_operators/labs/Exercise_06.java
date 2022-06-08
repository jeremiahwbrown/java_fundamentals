package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        float radius = 3.14f;
        int height = 5;
        float pie = 3.14f;
        float surfaceArea = 2*pie*radius*height + 2*pie*radius*radius;
        System.out.println(surfaceArea);
        float volume = pie*radius*radius*height;
        System.out.println(volume);


        // write code here

    }
}