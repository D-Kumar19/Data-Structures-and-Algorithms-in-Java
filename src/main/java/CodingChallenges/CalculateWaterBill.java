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

            if(waterConsumed < 0) throw new InputMismatchException();
            System.out.println("Your bill is: " + calculateWaterBill(waterConsumed));
        } catch (InputMismatchException e) {
            System.out.println("Sorry! This is not a Valid Input!");
        }
    }
    public static double calculateWaterBill(double waterConsumed){
        final int oneCCF = 748;
        final double oneCCFBill = 3.90;
        final double initialAmount = 18.84;
        if(waterConsumed <= 1496) return initialAmount;
        int numberOfCCFs = (int)Math.ceil(waterConsumed/oneCCF);
        double extraAmount = (numberOfCCFs - 2) * oneCCFBill;
        return 18.84 + extraAmount;
    }
}