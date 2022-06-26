package CodingChallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("This Program will check if a Number is Even or Odd!");

        int number;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 'Number': ");
            number = input.nextInt();

            if (isNumberEven(number)) System.out.println("Number is Even!");
            else System.out.println("Number is Odd!");
        } catch (InputMismatchException e) {
            System.out.println("Sorry! This is not a Valid Input!");
        }
    }
    public static boolean isNumberEven(int number){
        return number % 2 == 0;
        // return (number & 1) == 0;
    }
}