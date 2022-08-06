package basics;

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
        String newString = "This is a string."; // string = a sequence of characters
        Boolean isTrue = true; // Boolean stores true or false

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(thisNumber);
        System.out.println(thisLong);
        System.out.println(thisFloat);
        System.out.println(thisDouble);
        System.out.println(newChar);
        System.out.println(newString);
        System.out.println(isTrue);
        /*
        Here is an example of reference variables.
         */


    }
}