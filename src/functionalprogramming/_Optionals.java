package functionalprogramming;

import java.util.Optional;

public class _Optionals {
    /*
    Optionals help to deal with null pointer exceptions.

    So basically, if null or not determines what the output is going to be.
     */
    public static void main(String[] args) {

        Object newValue = Optional.of("Stefan")
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(newValue);
    }
}
