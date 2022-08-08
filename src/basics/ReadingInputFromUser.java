package basics;

import java.util.Scanner;

public class ReadingInputFromUser {
    public static void main(String[] args) {

          /*
        Here we will dive into reading user input from a screen
        Scanner class allows us to parse primitive types and Strings
        System.in reads input to the console which gets returned to program
        'new' used to create a new object of scanner
        Scanner scanner = new Scanner(System.in);
         */

        // Now we are going to do the same thing but with type Int
        System.out.println("Enter your birth Year: ");

        /*
        Here is how we create an instance of the Scanner interface.
         */
        Scanner scanner = new Scanner(System.in);

        /*
        Below we will create a simple example of reading the input, checking
        to make sure there is input, and comparing ages.
         */
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {

            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character enter key

            System.out.println("Enter your name: ");

            // nextLine grabs the next line of input from the console
            String name = scanner.nextLine();

            // Here we are going to subtract the current year from birth year to
            int age = 2022 - yearOfBirth;

            /*
            Now we will use an if statement to output the person's age and their name.
             */
            if (age >= 120 || age <= 0) {
                System.out.println("Your name is " + name + ", However you have an " +
                        "Invalid Age...");
            } else {
                System.out.println("Your name is " + name + " and you are " +
                        age + " years of age. ");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        // we must always close the scanner when we are finished.
        scanner.close();
    }
}

