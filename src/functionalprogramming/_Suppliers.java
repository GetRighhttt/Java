package functionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class _Suppliers {
    /*
    Suppliers represent a supplier of results; basically a get or return method.

    It usually takes no argument also.

    We use the ".get()" method with suppliers.
     */
    static Supplier<Integer> getNumber = () -> 50;
    static Supplier<String> getName = () -> "Stefan";
    static Supplier<List<Integer>> getNewNumbers =
            () -> List.of(20, 30, 40, 50, 60);


    public static void main(String[] args) {

        /*
        Now let's get the information:
         */

        System.out.println(getNumber.get()); // returns 50
        System.out.println(getName.get()); // returns "Stefan"
        System.out.println(getNewNumbers.get()); // returns [20, 30, 40, 50, 60]
    }
}
