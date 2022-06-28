package JavaStreams.CreatingInterfacesForStreams;

import java.util.Random;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        // Example # 01:
        // Using Typical way by creating a class and Interface:
        Greeting greetings1 = new HelloGreetings();
        greetings1.sayHello();

        // Using another method which is overriding, so we don't need the HelloGreetings.java class now:
        Greeting greetings2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello, How are you 2?");
            }
        };
        greetings2.sayHello();

        // Using Java streams:
        Greeting greetings3 = ()-> System.out.println("Hello, How are you 3?");
        greetings3.sayHello();


        // Example # 02:
        Calculator calculator1 = (int x, int y) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return x * y + randomNumber;
        };
        int x = 10, y = 15;
        System.out.println("The multiplication of " + x + " and " + y + " and the sum of a Random number is: " + calculator1.calculator(3, 5));

        // Using the same with built-in functions:
        IntBinaryOperator calculator2 = (a, b) -> {
            Random random = new Random();
            int randomNumber = random.nextInt(50);
            return a * b + randomNumber;
        };
        System.out.println("The multiplication of " + x + " and " + y + " and the sum of a Random number is: " + calculator2.applyAsInt(3, 5));


    }
}
