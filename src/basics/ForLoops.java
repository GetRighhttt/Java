package basics;

public class ForLoops {

    public static void main(String[] args) {

        /*
        Now we are going to go through For loops with Java.
         */
        // write your code here
        System.out.println("10,000 at 2% interest = " +
                calculateInterest(10000.0, 2.0));

        // "for" loop that goes upward
        for(int i=0; i<=5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // "for" loop that goes downward
        // String.format is used to format Strings in different ways
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at 2% " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        /*
        Another way to write for loops:
         */
        int[] arrayNum = {1, 2, 6, 0, 3, 8, 1, 9};
        for (int i : arrayNum) {
            System.out.println(i);
        }

    }

    // Method to calculate interest rates

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}

/*
Output:

10,000 at 2% interest = 200.0
Loop 0 hello!
Loop 1 hello!
Loop 2 hello!
Loop 3 hello!
Loop 4 hello!
Loop 5 hello!
10,000 at 2% 800.00
10,000 at 2% 700.00
10,000 at 2% 600.00
10,000 at 2% 500.00
10,000 at 2% 400.00
10,000 at 2% 300.00
10,000 at 2% 200.00
1
2
6
0
3
8
1
9
 */

