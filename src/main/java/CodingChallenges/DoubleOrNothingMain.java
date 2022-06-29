package CodingChallenges;

import java.util.Random;

public class DoubleOrNothingMain {
    public static void main(String[] args) {
        boolean continueGame = true;
        DoubleOrNothingClass playGame = new DoubleOrNothingClass();
        playGame.printWelcomeMessage();

        while(continueGame) {
            char choice = playGame.getChoice("Enter you choice ('N' for nothing and 'D' for Double)': ");
            choice = playGame.validateChoice(choice, "Enter you choice ('N' for nothing and 'D' for Double)': ");

            if (choice == 'N' || choice == 'n') {
                System.out.println("\nYou don't have guts xD");
                playGame.printPoints();
            } else {
                Random random = new Random();
                int randomNumber = random.nextInt(2);
                if (randomNumber == 1) {
                    System.out.println("\nCongratulations!");
                    playGame.setPoints(playGame.getPoints() * 2);
                    if(playGame.getPoints() == 0) playGame.setPoints(10);
                } else {
                    System.out.println("\nBad Luck!");
                    playGame.setPoints(0);
                }
                playGame.printPoints();
            }
            choice = playGame.getChoice("Do you want to play again? (Press 'C' to continue or any other key to leave): ");
            if (!(choice == 'C' || choice == 'c')) continueGame = false;
        }


    }
}