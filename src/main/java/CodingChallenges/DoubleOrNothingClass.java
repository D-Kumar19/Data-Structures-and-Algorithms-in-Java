package CodingChallenges;

import java.util.Scanner;

public class DoubleOrNothingClass {
    Scanner input = new Scanner(System.in);
    private int points;
    DoubleOrNothingClass(){
        this.points = 10;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public void printWelcomeMessage(){
        System.out.println("Welcome to this Game!");
        System.out.println("You will choose 'D' to Gamble and 'N' to not to Gamble.");
        System.out.println("If you Gamble and it is your Luck you will Double your points either you will lose all.");
        System.out.println("Your initial points are: " + this.points);
    }
    public char getChoice(String message){
        char choice = ' ';
        try {
            System.out.print(message);
            choice = input.nextLine().charAt(0);
        } catch (Exception e) {
            System.out.println("Sorry! This is not a Valid Input!");
        }
        return choice;
    }
    public char validateChoice(char choice, String message){
        while(choice != 'D' && choice != 'N' && choice != 'd' && choice != 'n'){
            System.out.println("\nThis is not the correct Input. Enter again!");
            choice = getChoice(message);
        }
        return choice;
    }
    public void printPoints(){
        System.out.println("Your final points are: " + this.points);
    }
}
