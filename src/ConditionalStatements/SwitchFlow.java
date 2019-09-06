package ConditionalStatements;

/**
 * Unlike if-then and if-then-else statements, the switch statement can have a number of possible execution paths.
 * A switch works with the byte, short, char, and int primitive data types.
 * It also works with enumerated types, the String class, and a few special classes
 * that wrap certain primitive types: Character, Byte, Short, and Integer (discussed in Numbers and Strings).
 */
public class SwitchFlow {

    public static void main(String[] args) {

        //switch(expression) {
        //    case x:
        //        // code block
        //        break;
        //    case y:
        //        // code block
        //        break;
        //    default:
        //        // code block
        //}

        // The default keyword specifies some code to run if there is no case match:

        int monthNum = 9;
        String month;

        switch (monthNum) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Invalid month";
                break;
        }

        System.out.println(month);

    }

}
