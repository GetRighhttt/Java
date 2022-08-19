package datastructures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListAndStreams {

    public static void main(String[] args) {
        /*
        We are going to explore list, which are like arrays except
        they do not have a fixed size.

        collect() is used to return the result of the operations performed on the
        stream.
         */

        // this is how we declare a list in Java.
        List<Integer> numbers = Arrays.asList(12, 33, 14, 55, 46, 7, 98, 9);

        // map() method applies a condition to all elements in the List.
        System.out.println(numbers.stream().map(x -> x * x).collect(Collectors.toList()));

        // filter() method is used to select elements according to the predicate
        System.out.println(numbers.stream().filter(x -> x > 34).collect(Collectors.toList()));

        // sorted() method is used to sort the stream.
        System.out.println(numbers.stream().sorted().collect(Collectors.toList()));

        // reduce() is used to reduce the stream to one value.
        // here we are going to add all the values together in the stream
        System.out.println(numbers.stream().reduce(1,
                (start, finish) -> start + finish));

        /*
        Outputs:

        map() = [144, 1089, 196, 3025, 2116, 49, 9604, 81]
        filter() = [55, 46, 98]
        sorted() = [7, 9, 12, 14, 33, 46, 55, 98]
        reduce() = 275
         */
    }
}
