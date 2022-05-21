package math.problems;

import org.junit.Test;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        @Test
        public void factorialLoop(){
            math.problems.Factorial fact = new math.problems.Factorial();
            int expected= 120;
            Assert.assertEquals(expected,Factorial.fact(5));

            System.out.println("I tried");
        }
}
