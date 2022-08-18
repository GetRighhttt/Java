package functionalprogramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _FunctionsExample {
    /*
      Here we show an example of how to use functional programming with a
      declarative approach for creating functions.

      Functions always take in arguments AND return arguments.

      Thats with regular Functions and BiFunctions.

      We use the ".apply()" method with Functions.
       */
    static Function<String, String> returnTheString = name -> name;

    public static void main(String[] args) {

        // this is how we usually call functions in java.
        System.out.println(decrement(50)); // returns 49

        // now we can call the String Function method like this
        String names = returnTheString.apply("Stefan Bayne");
        System.out.println(names);

        // this is the functional approach using the function interface
        Function<Integer, Integer> incrementByOne = x -> x + 1;

        // here we will create a multiply method to show how to chain functions
        Function<Integer, Integer> multiplyByOne = x -> x * 50;

        Function<Integer, Integer> andOneMultiplyByOne =
                incrementByOne.andThen(multiplyByOne);
        System.out.println(andOneMultiplyByOne.apply(10)); // returns 550

        System.out.println(andOneMultiplyByOne.apply(46)); // returns 2350

        /**
         * BiFunctions are the same except they take two parameters.
         *
         * Takes two integer arguments and returns one integer.
         *
         * Similar to the reduce function.
         */
        BiFunction<Integer, Integer, Integer> incrementThanMultiply =
                (numToIncrement, numToMultiply) -> (numToIncrement + 1) * numToMultiply;
        System.out.println(incrementThanMultiply.apply(10, 20)); // returns 220

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
