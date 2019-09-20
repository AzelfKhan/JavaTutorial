package loops;

/**
 * A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
 * The while loop can be thought of as a repeating if statement.
 */
public class WhileAndDoWhile {

    public static void main(String[] args) {

        // ---------------------------------------- While ----------------------------------------------------------

        // How does while loops work?
        // The while statement continually executes a block of statements while a particular condition is true.

        //while (expression) {
        //     statement(s)
        //}

        int numberOfContestants = 0;

        while (numberOfContestants < 5) {
            System.out.println("The total number of contestants in this raffle are: " + numberOfContestants);
            numberOfContestants++;
        }

        // How many times will this print out to the console? Will it eventually stop?


        // You can implement an infinite loop using the while statement.
        //while (true) {
        // code
        //}

        // ---------------------------------------- Do-While ----------------------------------------------------------

        // The Java programming language also provides a do-while statement, which can be expressed as follows:

        //do {
        //     statement(s)
        //} while (expression);

        // The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop
        // instead of the top. Therefore, the statements within the do block are always executed at least once

        int count = 0;

        do {
            System.out.println("Count is " + count);
            count++;
        } while (count < 5);
    }
}
