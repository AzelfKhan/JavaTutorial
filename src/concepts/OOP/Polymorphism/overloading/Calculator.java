package concepts.OOP.Polymorphism.overloading;

public class Calculator {

    boolean isScientific;
    String calcType;

    public Calculator() {}

    public Calculator(boolean isScientific) {
        this.isScientific = isScientific;
    }

    public Calculator(boolean isScientific, String calcType) {
        this.isScientific = isScientific;
        this.calcType = calcType;
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
}
