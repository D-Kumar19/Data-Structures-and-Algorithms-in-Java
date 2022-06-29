package CodingChallenges.GetDate;

import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class GetDateUsingBuiltin {
    public static void main(String[] args) {
        printWelcomeMessage();
        int daysCount = getNumberOfDays();

        LocalDate today = LocalDate.now();
        System.out.println("Today's Date: " + today);

        LocalDate dateAfterDays = getDateAfterDays(today, daysCount);
        System.out.println("The Date after " + daysCount + " days is: " + dateAfterDays);
    }

    public static void printWelcomeMessage(){
        System.out.println("This program will calculate 100 days from either a Date given or from Local Date!");
        System.out.println("Note: You can change the number of Days from 100 Days to any number!\n");
    }

    public static int getNumberOfDays(){
        Scanner input = new Scanner(System.in);
        int days = 0;
        try {
            do {
                System.out.print("Enter Number of Days: ");
                days = input.nextInt();
            } while (!validateDays(days));
        }catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        return days;
    }

    public static boolean validateDays(int days){
        return days >= 0;
    }

    public static LocalDate getDateAfterDays(LocalDate today, int daysCount){
        Period numberOfDays = Period.ofDays(daysCount);
        return today.plus(numberOfDays);
    }
}