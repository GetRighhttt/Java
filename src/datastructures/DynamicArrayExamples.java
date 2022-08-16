package datastructures;

import java.util.ArrayList;

public class DynamicArrayExamples {

    public static void main(String[] args) {
        /*
        Dynamic Arrays in Java.

        Java has two classes - Vector and ArrayList.

        Vector<> class grows by 100% of its size every time it gets full.
        Also, all Vector class methods are synchronized(only a single thread can
        access the method, so it is thread safe).

        ArrayList<> class grows by 50% of its size every time it gets full. Methods
        are not synchronized so when you are going to run something on multiple threads
        than you should use the ArrayList class.
         */

        // For all primitive types we have a wrapper class.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(60);
        list.add(80);
        list.add(20);
        list.add(70);
        list.add(40);

        // converts list to regular array = toArray()

        System.out.println(list.stream()
                .sorted().filter(x -> x % 4 == 0)
                .reduce(1, Integer::sum));
    }
}
