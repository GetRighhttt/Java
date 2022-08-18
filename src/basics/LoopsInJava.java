package basics;

public class LoopsInJava {
    /*
    Here we are going to discuss loops.

    while - allows us to loop while a condition is true.

    do-while - makes us iterate one time over the loop until a condition is true.

    if/else - when a condition is true, do some logic, else do some other logic.

    ternary operator - an if statement with easier syntax.
     */
    public static void main(String[] args) {

        /*
        Now is the while loop.
         */
        int x = 8;
        int count = 0;

        while (x  <= 20) {
            x++;
            count++;
        }

        System.out.println("The while loop continues while a condtion is true.");
        System.out.println("X = 8, & while x <= 20, count the iterations: ");
        System.out.println(count);
        System.out.println("The loop counts 8 -> 20 including 8 and 20.");
        System.out.println("--------------------------------------------------");

        /*
        Now is the do-while loop.
         */
        int y = 9;
        int countTwo = 0;

        do{
            y--;
            countTwo++;
        } while (y >= 0);

        System.out.println("The do-while loop iterates once at least then stops " +
                "when a given condition is met.");
        System.out.println("Do y-- while y >= 0:");
        System.out.println(countTwo);
        System.out.println("Y should negate 10 times including 9 and 0.");
        System.out.println("--------------------------------------------------");

        /*
        Now is the if-else statements.

        X at first was 8, but the while loop runs before the if statement, so
        now X is whatever the while loop condition finishes at.

        So, X should technically be greater than y now.
         */
        System.out.println("Now we are going to look at if statements.");
        System.out.println("If X is greater than Y, do some logic, else "+
                "do something else.");
        if(x > 9) {
            x++;
            System.out.println("X is greater than 9.");
        }
        else if(x < 0) {
            x--;
            System.out.println("X is less than y.");
        }
        else {
            System.out.println("Y is greater than X.");
        }
        System.out.println("----------------------------------------------------");

        /*
        Here we can call the returnNumber method we created to demonstrate the
        ternary operator.
         */
        System.out.println("Now we are doing the ternary operator which is the " +
                "same as an if statement except with fancier logic: ");
        System.out.println(returnNumber(9,20));
    }

    /*
    ternary operators are usually used in functional programming when you
    have an if statement that evaluates to one condition usually.
     */
    public static int returnNumber(int x, int y) {
        // if x > y, return x, else return y
        // if y > x, return y, else return 0
        return (x > y) ? x : (y > x) ? y : 0;
    }

    /**
     * Output:
     *
     * The while loop continues while a condition is true.
     * X = 8, & while x <= 20, count the iterations:
     * 13
     * The loop counts 8 -> 20 including 8 and 20.
     * --------------------------------------------------
     * The do-while loop iterates once at least then stops when a given condition is met.
     * Do y-- while y >= 0:
     * 10
     * Y should negate 10 times including 9 and 0.
     * --------------------------------------------------
     * Now we are going to look at if statements.
     * If X is greater than Y, do some logic, else do something else.
     * X is greater than 9.
     * ----------------------------------------------------
     * Now we are doing the ternary operator which is the same as an if statement except with fancier logic:
     * 20
     */
}
