package datastructures;

/*
Recursion is the process of solving problems by calling itself:

Using small solutions of code to solve the bigger problem.
 */
public class Recursion {

    // declaring a static array that we can use for all methods.
    static int[] arr = {2, 4, 1, 6, 9, 3, 2};

    public static void main(String[] args) {

        // writing to the console
        System.out.println(SumDigits(arr.length - 1));
        System.out.println(FactorialDigits(arr.length));
    }

    // Method to sum all the digits in the array recursively.
    public static int SumDigits(int n) { // = 27

        // if index is 0, return the array
        if (n == 0) return arr[n];

        // return the array of elements and sum them as the index decreases by 1
        return arr[n] + SumDigits(n - 1);
    }

    public static int FactorialDigits(int n) { // = 5040

        // if index is 1, return the array
        if (n == 1) {
            return 1;
        } else { // else return n * factorial(n - 1)
            return n * FactorialDigits(n - 1);
        }

    }
}
