package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int input = Integer.parseInt(scan.nextLine());

        System.out.println("Factorial of " + input + " is " + factorialLoop(input) );
        System.out.println("Factorial of " + input + " is " + factorialRecursively(input) );


    }

    public static int factorialLoop(int x) {

        int result = 1;

        if (x >= 1){
            for (int i = 1; i <= x; i++){
                result = result * i;

            }
        }
    else {

            System.out.println("Please enter a positive number");

        }
        return result;

    }

    public static int factorialRecursively (int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * factorialRecursively(f - 1);


        }


    }
}



