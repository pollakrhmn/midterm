package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner in = new Scanner(System.in);

        System.out.println("Enter first String (IN UPPER-CASE LETTERS): ");
        String st1 = in.nextLine();

        System.out.println("Enter second String (IN UPPER-CASE LETTERS): ");
        String st2 = in.nextLine();

        if (st1.length() == st2.length()) {

            char[] cArray1 = st1.toCharArray();
            char[] cArray2 = st2.toCharArray();

            Arrays.sort(cArray1);
            Arrays.sort(cArray2);

            boolean result = Arrays.equals(cArray1, cArray2);

            if (result) {
                System.out.println(st1 + " and " + st2 + " are anagram.");
            } else {
                System.out.println(st1 + " and " + st2 + " is not a anagram.");
            }
        }
            else {
                System.out.println(st1 + " and " + st2 + " is not a anagram.");
            }

            in.close();
        }



    }

