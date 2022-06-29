package CodingChallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateWaterBill {
    public static void main(String[] args) {
        System.out.println("This Program will calculate the Water Bill!");

        double waterConsumed;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of water liters consumed: ");
            waterConsumed = input.nextDouble();

            System.out.println("Your bill is: " + calculateWaterBill(waterConsumed));
        } catch (InputMismatchException e) {
            System.out.println("Sorry! This is not a Valid Input!");
        }
    }
    public static double calculateWaterBill(double waterConsumed){
        final int oneCCF = 748;
        int numberOfCCFs = (int)Math.ceil(waterConsumed/oneCCF);
        return 18.84 + ((numberOfCCFs - 2) * 3.90);
    }
}