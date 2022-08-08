package basics;

public class ParsingStrings {

    public static void main(String[] args) {

        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        /* This is how you parse values from a string
        Below we are going to demonstrate how to convert
        From a string to a double.
         */
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1; // Converts 2018 to 20181
        number += 1; // increments 2018 to 2019 by concatenation of Java
        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        String numberString = "2020";
        System.out.println("numberString = " + numberString);

        long example = Long.parseLong(numberString);
        example += 1;
        System.out.println("numberString = " + example);
    }
}
