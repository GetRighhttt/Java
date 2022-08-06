package basics;

/*
Here we will explore simple math operations.
 */
public class MathUtils {
    public static void main(String[] args) {
        System.out.println(10 + 10); // addition
        System.out.println(10 - 10); // subtraction
        System.out.println(10 / 10); // division
        System.out.println(10 * 10); // multiplication
        System.out.println(10 % 10); // modulus
        System.out.println((10 + 10) / 2); // multiple operations
        /*
        20
        0
        1
        100
        0
        10
         */

        /*
        Now we are going to examine some Math functions.
         */

        System.out.println(Math.abs(-50)); // turns negative to positive
        System.out.println(Math.max(10, 30)); // returns the max value of 2 numbers
        System.out.println(Math.decrementExact(10)); // decrements once
        System.out.println(Math.sqrt(100)); // returns square root
        System.out.println(Math.incrementExact(50)); // increments once
        System.out.println(Math.min(80, 81)); // returns min of 2 numbers
        System.out.println(Math.multiplyExact(2, 5)); // multiplies two numbers
        System.out.println(Math.random()); // returns random number
        System.out.println(Math.PI); // returns pi value
        System.out.println(Math.negateExact(60)); // returns a negative number
        System.out.println(Math.round(109.696)); // rounds to integer
        System.out.println(Math.ceil(90.459)); // rounds to nearest double precision
        System.out.println(Math.pow(2, 8)); // returns the number to the power of.

        /*
        20
        0
        1
        100
        0
        10
        50
        30
        9
        10.0
        51
        80
        10
        0.467006881623352
        3.141592653589793
        -60
        110
        91.0
        256.0
         */
    }
}
