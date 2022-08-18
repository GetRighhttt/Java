package functionalprogramming;

import java.util.function.Supplier;

public class _Suppliers {
    /*
    Suppliers represent a supplier of results; basically a get or return method.

    It usually takes no argument also.

    We use the ".get()" method with suppliers.
     */
    static Supplier<Integer> getNumber = () -> 50;
    static Supplier<String> getName = () -> "Stefan";
    public static void main(String[] args) {
        System.out.println(getNumber.get()); // returns 50
        System.out.println(getName.get()); // returns "Stefan"
    }
}
