package functionalprogramming;

import java.util.function.Predicate;

public class _PredicateExample {
    /*
    Predicate are boolean-value methods.

    So basically, it's a true or false methods that takes in one argument.

    We use the ".test()" method with predicates.
     */

    static Predicate<Integer> isBoolean = x -> x > 10;
    static Predicate<Integer> isLessThan = x -> x < 20;

    public static void main(String[] args) {

        System.out.println(isBoolean.test(30)); // returns true
        System.out.println(isBoolean.test(5)); // returns false
        System.out.println(isBoolean.test(7)); // returns false
        System.out.println(isBoolean.test(100)); // returns true

        /*
        We can also combine predicates together with ".and()" method.
         */
        System.out.println(
                isBoolean.and(isLessThan).test(15)); // returns true
        System.out.println(isBoolean.and(isLessThan).test(90)); // false
    }
}
