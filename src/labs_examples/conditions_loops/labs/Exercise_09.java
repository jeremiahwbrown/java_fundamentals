package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {

            for (int x = 0; x < 100; x++) {
                System.out.println(x);
                if (x == 11)
                    break;
            }
            for(int i = 0; i < 100; i++){
                System.out.println(i);
                if(i==9)
                    break;
            }

        }
    }
