package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */


        int n = 40, firstNum = 0, secondNum = 1;
        System.out.println("Forty Fibonacci Numbers:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstNum + ", ");

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;

        }

    }

}
