package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

import static functionalprogramming.ImperativeApproach.Gender.FEMALE;

public class ImperativeApproach {
    /*
    Imperative programming is essentially just you as a developer defining
    everything(each step) that you do in your program.
     */
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Sam", FEMALE),
                new Person("Stefan", Gender.MALE),
                new Person("Bill", Gender.MALE),
                new Person("Alex", FEMALE),
                new Person("Chrissy", FEMALE),
                new Person("Ayesha", FEMALE),
                new Person("Vince", Gender.MALE)
        );
        // Imperative approach for java

        /*
        Essentially, we are defining everything for something that is very simple
         */
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for(Person female: females) {
            System.out.println(female);
        }
    }

    enum Gender {
        MALE, FEMALE
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

    }
}
