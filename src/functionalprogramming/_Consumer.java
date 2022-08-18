package functionalprogramming;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    /*
   Consumer accepts a single argument and returns no result.

   A BiConsumer accepts two arguments and returns no result.

   It's basically a void function
    */
    static Consumer<Customer> greetThem = customer ->
            System.out.println("Hello " + customer.name + " and here's my number " +
                    customer.phoneNum);
    static BiConsumer<Customer, Customer> meetCustomers =
            (oneCustomer, twoCustomer) ->
                    System.out.println(oneCustomer.name + " is friends with "
                            + twoCustomer.name);


    public static void main(String[] args) {
        Customer stefan = new Customer("Stefan", "813-809-2847");
        greetCustomer(stefan);
        Customer vince = new Customer("Vince", "305-445-5555");

        // Functional
        greetThem.accept(stefan); // same output as above

        // BiFunctional example
        meetCustomers.accept(stefan, vince);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + " and here's my number " +
                customer.phoneNum);
    }

    static class Customer {
        private final String name;
        private final String phoneNum;

        Customer(String name, String phoneNum) {
            this.name = name;
            this.phoneNum = phoneNum;
        }
    }

    /**
     * Output:
     *
     * Hello Stefan and here's my number 813-809-2847
     * Hello Stefan and here's my number 813-809-2847
     * Stefan is friends with Vince
     */
}
