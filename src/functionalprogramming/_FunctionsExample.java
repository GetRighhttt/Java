package functionalprogramming;

import java.util.function.Function;

public class _FunctionsExample {
    // functional approach
    static Function<String, String> returnTheString = name -> name;

    public static void main(String[] args) {
        /*
        Here we show an example of how to use functional programming with a
        declarative approach for creating functions.
         */

        // this is how we usually call functions in java.
        System.out.println(decrement(50)); // returns 49

        // this is the functional approach using the function interface
        Function<Integer, Integer> incrementByOne = x -> x++;

        // now we can call the String Function method like this
        String names = returnTheString.apply("Stefan Bayne");
        System.out.println(names);
    }

    // typical approach aka Imperative approach
    static int decrement(int a) {
        return a - 1;
    }

    /*
    Output:

    49
    Stefan Bayne
     */
}
