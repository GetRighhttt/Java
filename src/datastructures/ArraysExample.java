package datastructures;

import java.util.Arrays;

public class ArraysExample {

    /*
    Arrays are probably the most important DataStructure in programming.

    They are used quite frequently, and especially in mobile development.

    In Java and many other languages, Arrays are static, which means one you specify
    its length, it's quite cumbersome to add on more space.

    We have to know ahead of time how many items we want to store in an array.

    Lookup O(1)
    Insert O(n)
    Delete O(n)
     */
    public static void main(String[] args) {

        /*
        Arrays are containers of data types that cannot grow or shrink when their size
        is specified.

        There are a lot of methods we can use to manipulate an array when necessary. Kind
        of like how we use methods to manipulate Strings.
         */

        // int array declaration of size 10
        int[] myIntArray = new int[10];

        // we use Arrays.toString() to print out the contents of the array as a String.
        System.out.println(java.util.Arrays.toString(myIntArray));
        /*
        output:

        [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
         */

        // we can add elements to an array by specifying their index, which starts at 0.
        myIntArray[0] = 1;
        myIntArray[1] = 8;
        myIntArray[2] = 57;
        myIntArray[3] = 2;
        myIntArray[4] = 6;
        myIntArray[5] = 34;
        myIntArray[6] = 26;
        myIntArray[7] = 89;
        myIntArray[8] = 74;
        myIntArray[9] = 60;
        System.out.println(Arrays.toString(myIntArray));

        // here is how we can loop through the elements of an array:
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }

        // we can also specify elements in the array in one line.
        String[] newStringArray = {"Here", "we", "are."};
        System.out.println(Arrays.toString(newStringArray));
        /*

        /*
        Now we are going to explore some array method manipulation.
         */

        // sort the array
        Arrays.sort(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

        //copies the array, gives a new length
        System.out.println(Arrays.toString(
                Arrays.copyOf(myIntArray, 20)));

        // copies a range of the array from index 0-6
        System.out.println(Arrays.toString(
                Arrays.copyOfRange(myIntArray, 0, 6)));

        // deepEquals() returns true if the array is equal to the other array
        System.out.println(Arrays.deepEquals(new int[][]{myIntArray}, newStringArray));

        // searches for an element in an array using binary search algorithm
        // will return the item index of 34
        int item = 34;
        System.out.println(Arrays.binarySearch(myIntArray, item));

        // finds the first element and returns an optional integer.
        System.out.println(Arrays.stream(myIntArray).findFirst());

        // returns min and max of the array as OptionalInteger
        System.out.println(Arrays.stream(myIntArray).min());
        System.out.println(Arrays.stream(myIntArray).max());

        // returns the average of all the integers in the array as OptionalDouble
        System.out.println(Arrays.stream(myIntArray).average());
        /*
        Outputs:

        sort() = [1, 2, 6, 8, 26, 34, 57, 60, 74, 89]
        copies() = [1, 2, 6, 8, 26, 34, 57, 60, 74, 89, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        copyOfRange() = [1, 2, 6, 8, 26, 34]
        deepEquals() = false
        binarySearch(34) = 5
        OptionalInt[1]
        OptionalInt[1]
        OptionalInt[89]
        OptionalDouble[35.7]
         */

    }
}
