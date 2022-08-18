package objectorientedprogramming;

import java.util.Locale;

public class WhatAreObjects {
    public static void main(String[] args) {
        /*
        An object is anything in the real world; essentially, it's an entity.
        Car, dog, letter, name, person, television, computer, etc.

        A class is a blueprint or template for creating objects.

        The string class is a class and the names are the objects of that class.

        The "new" keyword in java signifies an object.
         */
        String name = new String("Stefan");
        String name1 = "John";
        String name2 = "Vince";

        // returns the length
        System.out.println(name.length());

        // repeats the name a number of times.
        System.out.println(name1.repeat(4));

        // makes all the letters uppercase
        System.out.println(name2.toUpperCase(Locale.ROOT));

        /**
         * Output:
         *
         * 6
         * JohnJohnJohnJohn
         * VINCE
         */
    }
}
