package CodingChallenges;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PasswordComplexity {
    public static void main(String[] args) {
        System.out.println("This Program will check if the Password entered is Complex or not?");

        String password;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 'Password': ");
            password = input.nextLine();

            if (isPasswordComplex(password)) System.out.println("Yes, Password is Complex!");
            else System.out.println("No, Password is not Complex!");
        } catch (Exception e) {
            System.out.println("Sorry! This is not a Valid Input!");
        }
    }
    public static boolean isPasswordComplex(String password){
        // First Method:
        /*
        String upperCase = ".*[A-Z].*";
        String lowerCase = (".*[a-z].*");
        String numericalValues = (".*[0-9].*");
        return password.length() >= 6 && password.matches(upperCase) && password.matches(lowerCase) && password.matches(numericalValues);
        */

        // Second Method:
        boolean lengthCheck = false;
        boolean upperCaseCheck = false;
        boolean lowerCaseCheck = false;
        boolean numericalCaseCheck = false;

        if(password.length() < 6) return false;

        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))) upperCaseCheck = true;
            else if(Character.isLowerCase(password.charAt(i))) lowerCaseCheck = true;
            else if(Character.isDigit(password.charAt(i))) numericalCaseCheck = true;

            if(upperCaseCheck && lowerCaseCheck && numericalCaseCheck) return true;
        }
        return false;
    }
}