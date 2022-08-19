package functionalprogramming;

import java.util.Arrays;
import java.util.List;

public class _StreamsExplained {
    /*
        Java8 came with an API that allows us to create code a lot easier.

        Stream() takes us to an abstraction mode where we can optimize our java
        code.

        Here we are going to explore the functional programming techniques
        we learned in the other classes.
         */

    public static void main(String[] args) {

        // first delcare a collection
        List<String> myList = Arrays.asList("Stefan",
                "John", "Vince"
                , "Shawn", "Bayne");

        /*
        Here is how we can use streams:

        map() is used to apply something to every item in the stream so here we
        make everything uppercase.

        collect and Collectors basically just collect the data to the
        collection that you're using, however we can use .toList() here.

        forEach() as you know iterates through the loop like a for method.
         */
        myList.stream()
                .map(String::toUpperCase).toList()
                .forEach(System.out::println);

        /**
         * Output:
         *
         * STEFAN
         * JOHN
         * VINCE
         * SHAWN
         * BAYNE
         */

        /*
        We can also map the items to their lengths.

        This returns the minimum length of the smallest string with the min()
        method.
         */
        System.out.println(myList.stream()
                .mapToInt(String::length)
                .min());

    }
}
