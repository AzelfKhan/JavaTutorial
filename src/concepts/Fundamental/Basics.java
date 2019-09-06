package concepts.Fundamental;
/**
 * class is a blueprint of an object.
 *
 * In class you declare different methods and objects
 *
 * Syntax for class:
 * [access modifier][keyword:class][Name of the class]
 *
 * Definitions:
 * Access Modifier (Access Specifier) = determines if other classes or packages can see your methods or variables.
 * Keyword = reserved words that Java use that have predefined meaning
 *
 * IMPORTANT: Name of the class must start with Capital Letter
 *
 */
public class Basics {

    /**
     * Variables are used to store data. All variables or declarations are ended with a ';'
     * Java is a strongly types language...meaning you have to tell Java what it does and what it is.
     *
     * Syntax for variable:
     * [access modifier - optional][variable name][use '=' sign to give a value to variable][variable value]
     * ex: int wholeNumber = 12;
     *
     */

    // Primitive Global Variable
    int wholeNumber; // Declaring only one wholeNumber variable
    int firstIntVariable, secondIntVariable; // declaring two different int type variable in one line
    double decimalNumbers = 12.4;
    boolean trueOrFalse = false;

    // Non-primitive or Reference types
    String wordsOrSentence = "Sup, I am a string"; // Strings are always in double quotations -> " "

    /**
     * Methods are a set of codes used to carry out a specific function, methods can be called or invoked at any point in a program by using its name
     *
     * main() method is the entry point for a Java program
     * We will come back to the arguments inside the method later (Talking about 'String[] args' --- anything inside '()' is an arguments
     *
     * IGNORE 'static' keyword for now!
     *
     * Syntax for Method():
     * [access specifier][data return type][method name][open and close parenthesis][{//}]
     *
     */
    public static void main(String[] args) {// opening braces indicating beginning of method

        // this is the body of the methods...you can write set of codes with the opening and closing braces

        // we can create variables inside methods called local variables...any variable outside the method but within the class are called global variable
        char singleChar = 'a';

        // This code is used to print out something to the console
        System.out.println("Print out wholeNumber: " + singleChar);

    }// closing braces indicating method ends here
}
