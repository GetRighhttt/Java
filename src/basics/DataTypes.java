package basics;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class DataTypes {

    /*
    Let's begin by understanding the basics of java variables:

    variable name can only be declared certain ways.

    In Java, we have primitive types and reference types.
     */
    public static void main(String[] args) {
        /*
        Here is how we declare variables in Java
        with an example of primitive data types.
         */
        byte theByte = -128; // byte value stores whole numbers from -128 -> 127
        short theShort = -32_000; // short value numbers = -32768 -> 32767
        int thisNumber = 78_838_334; // integer value = -2 bill -> 2 bill
        long thisLong = 16_513_151_681_351L; // Long value = over trillions
        float thisFloat = 20.0F; // Float value = fractional 6-7 digits
        double thisDouble = 50.000; // Double value = fractional values 15 digits
        char newChar = 'C'; // character value
        Boolean isTrue = true; // Boolean stores true or false

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(thisNumber);
        System.out.println(thisLong);
        System.out.println(thisFloat);
        System.out.println(thisDouble);
        System.out.println(newChar);
        System.out.println(isTrue);


        /*
        Here is an example of reference types.

        Reference types are created a lot of time and are used majority of the
        time for Java developers.

        Reference types give you built in behaviors that are not available to
        primitive types.

        They always start with uppercase.
         */
        String name = "Get Right Code";

        System.out.println(name.toLowerCase(Locale.ROOT)); // prints lowercase name
        System.out.println(name.toUpperCase(Locale.ROOT)); // prints uppercase
        // split(" ") splits the string into an array separated by commas.
        System.out.println(Arrays.toString(name.split(" ")));
        // checks to see if the string ends with the code in quotes.
        System.out.println(name.endsWith("Code"));
        // checks if the name contains a Get string.
        System.out.println(name.contains("Get"));
        // checks to see if name matches regex.
        System.out.println(name.matches("/\s"));
        System.out.println(name.repeat(3)); // repeats string
        // strips string from index(start, end)
        System.out.println(name.substring(3, 8));

        // provides today's date.
        LocalDate now = LocalDate.now();
        System.out.println(now);

        // provides the month
        System.out.println(now.getMonth());

        /*
        output:

-128
-32000
78838334
16513151681351
20.0
50.0
C
true
get right code
GET RIGHT CODE
[Get, Right, Code]
true
true
false
Get Right CodeGet Right CodeGet Right Code
Righ
2022-08-06
AUGUST
         */
    }
}