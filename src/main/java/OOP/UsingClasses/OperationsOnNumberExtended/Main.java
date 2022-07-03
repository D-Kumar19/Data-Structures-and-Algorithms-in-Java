package OOP.UsingClasses.OperationsOnNumberExtended;

public class Main {
    public static void main(String[] args) {
        OperationsOnNumberExtended number = new OperationsOnNumberExtended(6);

        // Checking if number is Prime or Not:
        boolean isNumberPrime = number.isPrime();
        if (isNumberPrime) {
            System.out.println(number.getNumber() + " is a Prime!");
        } else {
            System.out.println(number.getNumber() + " is not a Prime!");
        }

        // Getting the sum of numbers till N:
        int sum = number.sumUpToN();
        System.out.println("Sum of numbers up tp " + number.getNumber() + " is: " + sum);

        // Getting the sum of only divisors till N:
        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("Sum of Divisors of " + number.getNumber() + " is: " + sumOfDivisors);

        // Print a Triangle till number N:
        number.printANumberTriangle();

        // Printing number till Square and Cube of Limit:
        final int limit = 100;
        number.setLimit(limit);
        number.printSquareUpToLimit();
        number.printCubesUpToLimit();
    }
}
