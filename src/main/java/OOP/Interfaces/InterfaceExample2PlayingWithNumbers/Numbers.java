package OOP.Interfaces.InterfaceExample2PlayingWithNumbers;

public interface Numbers {
    int complexAlgorithm(int number1, int number2);

    default void method() {
        System.out.println("Hello World!");
    }
}