package DataStrcuturesAndAlgorithms.SortingMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        // O(n^2) Time Complexity
        System.out.println("This Program will sort the Array using Bubble Sorting!");

        int size = 0;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter size of the Array: ");
            size = input.nextInt();

            if(size > 0) {
                int[] bubbleSort = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Enter element # " + (i + 1) + ": ");
                    bubbleSort[i] = input.nextInt();
                }
                System.out.println("\nArray before sorting was performed: \n" + Arrays.toString(bubbleSort));
                if (size > 1) {
                    bubbleSort(size, bubbleSort);
                }
                System.out.println("\nArray after sorting was performed: \n" + Arrays.toString(bubbleSort));
            }
            else System.out.println("Can't take Inputs as size is less than 1!");
        } catch (InputMismatchException e) {
            System.out.println("Sorry! This is not the Specified Input!");
        }
    }

    private static void bubbleSort(int size, int[] bubbleSort) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (bubbleSort[j] > bubbleSort[j + 1]) {
                    int temp = bubbleSort[j];
                    bubbleSort[j] = bubbleSort[j + 1];
                    bubbleSort[j + 1] = temp;
                }
            }
        }
    }
}