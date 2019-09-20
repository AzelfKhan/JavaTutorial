package loops;

/**
 * The for statement provides a compact way to iterate over a range of values.
 * Programmers often refer to it as the "for loop" because of the way in which it repeatedly loops
 * until a particular condition is satisfied
 */
public class ForLoops {

    //for (initialization; termination; increment) {
        //    statement(s)
    //}

    //When using this version of the for statement, keep in mind that:
    //1. The initialization expression initializes the loop; it's executed once, as the loop begins.
    //2. When the termination expression evaluates to false, the loop terminates.
    //3. The increment expression is invoked after each iteration through the loop.
    //  It is perfectly acceptable for this expression to increment or decrement a value.

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print out the number ... " + i);
        }

        //  Blank Space
        System.out.println();

        for (int i = 5; i < 10; i++) {
            System.out.println("Print out the number ... " + i);
        }

        //  Blank Space
        System.out.println();

        for (int i = 10; i > 0; i--) {
            System.out.println("Print out the number ... " + i);
        }

        //  Blank Space
        System.out.println();

        // infinite for loop; avoid this!
//        for (int i = 0; i < 5; i--) {
//            System.out.println("Print out the number ... " + i);
//        }

        //  Blank Space
        System.out.println();

        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Print out the number ... " + i);
        }

        //  Blank Space
        System.out.println();

        // for loop using if else
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            } else {
                System.out.println(i + " is an odd number");
            }
        }

        //  Blank Space
        System.out.println();

        //  Nested Loop ---> Loop inside a loop
        for (int i = 0; i < 4; i++) {
            System.out.println("Beginning of phase " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("i = " + i + " and j = " + j);
            }
            System.out.println("End of phase " + i + "\n");
        }
    }
}
