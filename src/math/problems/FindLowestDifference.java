package math.problems;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        // Given
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};

        // Size of both Array was assigned to int m and n
        int m = array1.length;
        int n = array2.length;

        // Calling method and passing in arguments
        System.out.println("Lowest difference between two array cell: " + minimumDiff(array1, array2, m, n));

    }

        static int minimumDiff(int [] array1, int [] array2, int m, int n) {

            // Invoking sort() method of the Array class
            Arrays.sort(array1);
            Arrays.sort(array2);

            int a1 = 0, a2 = 0;

            int result = Integer.MAX_VALUE;

            // Scan both Array up to the size of the Array
            while (a1 < m && a2 < n) {

                if (Math.abs(array1[a1] - array2[a2]) < result)
                    result = Math.abs(array1[a1] - array2[a2]);

                // Move smaller value
                if (array1[a1] < array2[a2])
                    a1++;

                else
                    a2++;

            }

            // Return final result
            return result;

        }

            }

