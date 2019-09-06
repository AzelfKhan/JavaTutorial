package ConditionalStatements;

/**
 * Else statement is encountered, condition is tested.
 * If condition is True , the statements following Then are executed.
 * If condition is False , each ElseIf statement (if there are any) is evaluated in order.
 * When a True else if condition is found, the statements immediately following the associated ElseIf are executed.
 */
public class IfElse {

    public static void main(String[] args) {

        // How do If Then Else statements work?
        int example = 5;

        // Example 1
        if (example > 0) {
            // body of if               <----- it will run whatever code is inside this body since 5 is greater than 0
        } else {
            // body of else             <----- it will skip this since it went to the body of if already
        }

        // Example 2
        if (example < 0) {
            // body of if               <----- it will skip this since 5 is NOT less than 0 and will move to else
        } else {
            // body of else             <----- it will run whatever code is inside this body
        }

        // Example 3
        if (example < 0) {
            // body of if               <----- it will skip this since 5 is NOT less than 0 and will move to else
        } else {
            // body of else             <----- it will run whatever code is inside this body
        }
        // other code                   <----- it will always run this code no matter what

        // Let us look at the example below
        boolean billPaid = false;
        String customer = "Fahim";

        if (billPaid == false) {
            System.out.println("Charge " + customer + " $50 late fee");
        } else {
            System.out.println(customer + " has already paid their bill");
        }
        scheduleBill();
        System.out.println();

        // ---------------------------------------------------------------------------------------------------------
        boolean isEnabled = false;

        System.out.println("~~~~~ If else statement ~~~~~");
        if (isEnabled) {
            System.out.println("It's set to TRUE");
        }

        if (isEnabled) {
            System.out.println("It's set to TRUE");
        } else {
            System.out.println("It's set to FALSE");
        }

        // ---------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("~~~~~ If else statement with NOT operator ~~~~~");
        if (!isEnabled) {
            System.out.println("It's set to FALSE");
        } else {
            System.out.println("It's set to TRUE");
        }

        // ---------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("~~~~~ If else statement with EQUAL TO operator ~~~~~");
        if (isEnabled == true) {
            System.out.println("It's set to TRUE");
        }

        if (isEnabled == false) {
            System.out.println("It's set to FALSE");
        }

        // ---------------------------------------------------------------------------------------------------------
        int a = 5;
        int b = 10;
        int c = -3;
        int d = 15;
        int e = 10;

        System.out.println();
        System.out.println("~~~~~ If else statement with GREATER/EQUAL THAN, LESS/EQUAL THAN AND EQUAL/NOT EQUAL TO operators ~~~~~");
        if (a > 0) {
            System.out.println(b + " is greater than 0");
        }

        if (!(c > 0)) {
            System.out.println(c + " is not greater than 0");
        }

        if (a + b > c) {
            System.out.println(a + " + " + b + " is greater than " + c);
        }

        if (a < b) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " is not less than " + b);
        }

        if (b <= e) {
            System.out.println(b + " is less than or equal to " + e);
        }

        if (b == e) {
            System.out.println("They're equal values.");
        } else {
            System.out.println("They're not equal values");
        }

        if (b != d) {
            System.out.println("They're not equal values.");
        }

        if ((a + b) == d) {
            System.out.println(a + " + " + b + " = " + d);
        }

        // ---------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("~~~~~ If else statement with AND OR operators ~~~~~");
        boolean pigsCanFly = false;
        boolean humansCanFly = false;
        boolean birdsCanFly = true;
        boolean planesCanFly = true;

        /**
         * AND TABLE (&&)
         *
         *          TRUE        FALSE
         * TRUE     TRUE        FALSE
         *
         *
         * FALSE    FALSE       FALSE
         */

        /**
         * OR TABLE (||)
         *
         *          TRUE        FALSE
         *
         * TRUE     TRUE        TRUE
         *
         *
         * FALSE    TRUE        FALSE
         */

        if (pigsCanFly && humansCanFly) {
            System.out.println("You're out of your mind");
        } else {
            System.out.println("Of course they can't fly");
        }

        if (pigsCanFly && birdsCanFly) {
            System.out.println("All animals can fly");
        }

        if (humansCanFly || planesCanFly) {
            System.out.println("Humans don't have to worry about flying across the world since it's possible");
        } else {
            System.out.println("Humans can never be able to fly across the world");
        }

        if (birdsCanFly && (a >= b)) {
            System.out.println("This is correct");
        } else {
            System.out.println("This is incorrect");
        }

        // ---------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("~~~~~ Multiple If else statements ~~~~~");
        int j = 0;
        int k = 1;
        int l = 2;
        int m = 3;

        if (j > k) {
            System.out.println("HELLO");
        } else if (k > l) {
            System.out.println("WORLD");
        } else if (l > m) {
            System.out.println("HELLO WORLD!");
        } else {
            System.out.println("Bye");
        }
        System.out.println("Something");

        // ---------------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("~~~~~ Nested If else statements ~~~~~");
        int n = 4;
        int o = 5;
        String month = "February";

        if (n < o) {
            if (month == "January") {
                System.out.println("Statement One");
            } else if (month == "February") {
                System.out.println("Statement Two");
            } else {
                System.out.println("Statement Three");
            }
        } else {
            System.out.println("Statement Four");
        }
        System.out.println("Statement Five");
    }

    public static void scheduleBill() {
        System.out.println("Bill is scheduled");
    }

}

