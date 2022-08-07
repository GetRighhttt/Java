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
        Splits the string into an array of characters.

        [H, e, r, e,  , I,  , a, m, !]
         */
        System.out.println(Arrays.toString(name.split("")));

        /*
        Splits the string into an array of words separated by commas.

        [Here, I, am!]
        [Here, I, am!]
         */
        System.out.println(Arrays.toString(name.split("\\s+")));
        System.out.println(Arrays.toString(name.split(" ")));

        /*
        We can add strings together. (Concatenating strings)
         */
        String lastName = "Bayne";
        String firstName = "Stefan";
        System.out.println(lastName + " " + firstName);
        // method adds the strings together.
        System.out.println(name.concat(lastName));

        /*
        Demonstrating the replace all method that really comes in handy when
        doing string manipulation.
         */
        System.out.println("----------------------------------------------------");
        System.out.println("Demonstrating the replace all method.");
        System.out.println("Initial String: ");
        String replaceAllString = "This is a String that we are going to use to replace all the a's with o's.";
        System.out.println(replaceAllString);
        System.out.println("String replace all method: ");
        System.out.println(replaceAllString.replaceAll("a", "o"));
        /*
        Output:
        This is o String thot we ore going to use to reploce oll the o's with o's.
         */
    }
}
