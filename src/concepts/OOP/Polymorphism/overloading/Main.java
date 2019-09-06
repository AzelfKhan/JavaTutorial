package concepts.OOP.Polymorphism.overloading;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum1 = calc.add(10, 15);
        System.out.println(sum1);
        System.out.println();

        int sum2 = calc.add(10, 15, 25);
        System.out.println(sum2);
        System.out.println();

        double sum3 = calc.add(2.75, 2.25);
        System.out.println(sum3);
        System.out.println();

        double sum4 = calc.add(1.1, 2.2, 3.3);
        System.out.println(sum4);
        System.out.println();

        int diff1 = calc.subtract(10, 5);
        System.out.println(diff1);
        System.out.println();

        double diff2 = calc.subtract(30.5, 0.5);
        System.out.println(diff2);
    }

}
