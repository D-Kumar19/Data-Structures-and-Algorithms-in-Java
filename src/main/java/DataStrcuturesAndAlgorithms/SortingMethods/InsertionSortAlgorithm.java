package DataStrcuturesAndAlgorithms.SortingMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InsertionSortAlgorithm {
	public static void main(String[] args) {
		// O(n^2) Time Complexity
		System.out.println("This Program will sort the Array using Insertion Sort!");

		int size;
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter size of the Array: ");
			size = input.nextInt();

			if(size > 0) {
				int[] insertionSort = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.print("Enter element # " + (i + 1) + ": ");
					insertionSort[i] = input.nextInt();
				}
				System.out.println("\nArray before sorting was performed: \n" + Arrays.toString(insertionSort));
				if (size > 1) {
					insertionSort(size, insertionSort);
				}
				System.out.println("\nArray after sorting was performed: \n" + Arrays.toString(insertionSort));
			}
			else System.out.println("Can't take Inputs as size is less than 1!");
		} catch (InputMismatchException e) {
			System.out.println("Sorry! This is not the Specified Input!");
		}
	}

	public static void insertionSort(int size, int[] insertionSort) {
		for (int i = 1; i < size; i++) {
			int current  = insertionSort[i];
			int j = i - 1;
			while(j >= 0 && insertionSort[j] > current){
				insertionSort[j+1] = insertionSort[j];
				j--;
			}
			insertionSort[j + 1] = current;
		}
	}
}