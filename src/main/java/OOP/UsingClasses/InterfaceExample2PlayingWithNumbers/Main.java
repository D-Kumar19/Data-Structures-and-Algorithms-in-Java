package OOP.UsingClasses.InterfaceExample2PlayingWithNumbers;

public class Main {
    public static void main(String[] args) {
        Numbers c1 = new ImplementingNumbers1();
        System.out.println("Sum: " + c1.complexAlgorithm(10, 12));

        Numbers c2 = new ImplementingNumbers2();
        System.out.println("Multiplication: " + c2.complexAlgorithm(10, 12));

        System.out.println("\nDefault Methods without Overriding: ");
        c1.method();
        c2.method();
    }
}