package OOP.UsingClasses.OperationsOnNumbers;

public class Main {
    public static void main(String[] args) {
        BiNumber numbers = new BiNumber(2, 3);
        System.out.println("Sum of " + numbers.getNumber1() + " and " + numbers.getNumber2() + " is: " + numbers.add());
        System.out.println("Multiplication of " + numbers.getNumber1() + " and " + numbers.getNumber2() + " is: " + numbers.multiply());

        System.out.println("Double the numbers: ");
        numbers.doubleNumbers();
        System.out.println("After Doubling the first number is: " + numbers.getNumber1());
        System.out.println("After Doubling the second number is: " + numbers.getNumber2());
    }
}