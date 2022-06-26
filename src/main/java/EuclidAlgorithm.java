import java.util.InputMismatchException;
import java.util.Scanner;

public class EuclidAlgorithm {

    public static void main(String[] args) {
        System.out.println("This Program will find the GCD of two Numbers Given!");

        int m = 0, n = 0;
        boolean calculate = true;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 'M': ");
            m = input.nextInt();
            System.out.print("Enter 'N': ");
            n = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sorry! This is not the Specified Input for GCD!");
            calculate = false;
        }

        if(calculate){
            if(m == 0 || n == 0){
                System.out.println("M or N must be Non-zero!");
            }
            else {
                int result = 0;
                if (m == n) result = m;
                else {
                    int minNumber = Math.min(m, n);
                    int maxNumber = Math.max(m, n);
                    result = findGCD(minNumber, maxNumber);
                }
                if(m < 0 || n < 0) result *= -1;
                System.out.println(result + " is GCD of " + m + " and " + n + "!");
            }
        }
        else System.out.println("No calculations performed!");
    }

    public static int findGCD(int m, int n){
        int r = m % n;
        while (r != 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
}