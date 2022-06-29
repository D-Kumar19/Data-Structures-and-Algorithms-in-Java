package CodingChallenges.GetDate;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.InputMismatchException;

public class GetDateAfterDaysFromNow {
    public static void main(String[] args) {

        printWelcomeMessage();
        int choice = getUserChoice();

        int dayOfMonth = 0, month  = 0, year = 0;

        if(choice == 1) {
            LocalDate today = LocalDate.now();
            dayOfMonth = today.getDayOfMonth();
            month  = today.getMonthValue();
            year = today.getYear();
            System.out.println("Today's Date: " + today);
        }
        else{
            System.out.println("\nYou will be Entering Date Manually: ");
            year = getYear();
            System.out.println();
            month = getMonth();
            System.out.println();
            dayOfMonth = getDate(month, year);
            System.out.print("Date Entered: ");
            formatOutput(year, month, dayOfMonth);
        }
        System.out.println();
        int daysCount = getNumberOfDays();

        getDateAfterDays(dayOfMonth, month, year, daysCount);
    }

    public static void printWelcomeMessage(){
        System.out.println("This program will calculate 100 days from either a Date given or from Local Date!");
        System.out.println("Note: You can change the number of Days from 100 Days to any number!\n");
    }

    public static int getUserChoice(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        try {
            do {
                System.out.println("Enter '1' to check Date from Today's Date");
                System.out.println("Enter '2' to enter a Date Manually");
                System.out.print("Enter Choice: ");
                choice = input.nextInt();
            } while (!validateChoice(choice));
        }catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        return choice;
    }

    public static boolean validateChoice(int choice){
        if(choice == 1 || choice == 2) return true;
        System.out.println("\nThis choice is not available. Enter your choice again!");
        return false;
    }

    public static int getYear(){
        Scanner input = new Scanner(System.in);
        int year = 0;
        try {
            do {
                System.out.print("Enter Year: ");
                year = input.nextInt();
            } while (!validateYear(year));
        }catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        return year;
    }

    public static boolean validateYear(int year){
        if(year >= 1900 && year <= 2099) return true;
        System.out.println("\nYour Year should be between 1900 and 2099. Enter again!");
        return false;
    }

    public static int getMonth(){
        Scanner input = new Scanner(System.in);
        int month = 0;
        try {
            do {
                System.out.print("Enter Month: ");
                month = input.nextInt();
            } while (!validateMonth(month));
        }catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        return month;
    }

    public static boolean validateMonth(int month){
        if(month >= 1 && month <= 12) return true;
        System.out.println("\nInvalid Month. Enter again!");
        return false;
    }

    public static int getDate(int month, int year){
        Scanner input = new Scanner(System.in);
        int date = 0;
        try {
            do {
                System.out.print("Enter Date: ");
                date = input.nextInt();
            } while (!validateDate(date, month, year));
        }catch(InputMismatchException e){
            System.out.println("Invalid Input!");
            System.exit(0);
        }
        return date;
    }

    public static boolean validateDate(int date, int month, int year){
        int days =  checkDaysInMonth(month, year);
        if(date >= 1 && date <= days) return true;
        System.out.println("\nInvalid Date. Enter again!");
        return false;
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

    public static int checkDaysInMonth(int month, int year){
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> isLeapYear(year);
        };
    }

    public static int isLeapYear(int year){
        if(year % 4 == 0) return 29;
        else return 28;
    }

    public static void getDateAfterDays(int dayOfMonth, int month, int year, int daysCount) {
        int numberOfDays = 0;
        boolean firstMonth = true;

        while (numberOfDays < daysCount) {
            int daysInMonth = checkDaysInMonth(month, year);
            if (firstMonth) {
                daysInMonth = daysInMonth - dayOfMonth;
                firstMonth = false;
            }

            numberOfDays += daysInMonth;
            System.out.println(daysInMonth + " " + numberOfDays + " " + month);
            if (numberOfDays < daysCount) {
                if (month < 12) month++;
                else {
                    month = 1;
                    year++;
                }
            } else {
                dayOfMonth = daysInMonth - (numberOfDays - daysCount);
            }
        }

        System.out.print("Date after " + daysCount + " days is: ");
        formatOutput(year, month, dayOfMonth);
    }

    public static void formatOutput(int year, int month, int dayOfMonth){
        StringBuilder formattedDate = new StringBuilder();
        formattedDate.append(year).append('-');
        if(month < 10) formattedDate.append("0");
        formattedDate.append(month).append('-');
        if(dayOfMonth < 10) formattedDate.append("0");
        formattedDate.append(dayOfMonth);
        System.out.println(formattedDate);
    }
}