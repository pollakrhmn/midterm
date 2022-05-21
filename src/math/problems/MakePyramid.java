package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */

    int i, j, row = 6;

    // Outer loop for rows
    for (i = 0; i < row; i++){    // Inner loop for spaces
    for (j = row - i; j > 1; j--){

        System.out.print(" ");

    }

    // Inner loop for columns
    for (j = 0; j <= i; j++){

        System.out.print("* ");

    }
        // throws the cursor in a new line after printing each line
        System.out.println();
    }
    }

  }
