package basics;

import java.util.Arrays;
import java.util.Locale;

/*
A string is simply a sequence of characters,
separated by spaces.
 */
public class Strings {
    public static void main(String[] args) {

        // How we declare a string
        String name = "Here I am!";

        /*
        Strings have built-in methods.
         */
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

        /*
        We can add strings together. (Concatenating strings)
         */

        String lastName = "Bayne";
        String firstName = "Stefan";
        System.out.println(lastName + " " + firstName);
        // method adds the strings together.
        System.out.println(name.concat(lastName));
    }
}
