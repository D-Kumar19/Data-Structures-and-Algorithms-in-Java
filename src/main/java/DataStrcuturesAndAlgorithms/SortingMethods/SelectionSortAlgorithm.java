package DataStrcuturesAndAlgorithms.SortingMethods;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SelectionSortAlgorithm {
	public static void main(String[] args) {
		// O(n^2) Time Complexity
		System.out.println("This Program will sort the Array using Selection Sort!");

		int size;
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter size of the Array: ");
			size = input.nextInt();

			if(size > 0) {
				int[] selectionSort = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.print("Enter element # " + (i + 1) + ": ");
					selectionSort[i] = input.nextInt();
				}
				System.out.println("\nArray before sorting was performed: \n" + Arrays.toString(selectionSort));
				if (size > 1) {
					selectionSort(size, selectionSort);
				}
				System.out.println("\nArray after sorting was performed: \n" + Arrays.toString(selectionSort));
			}
			else System.out.println("Can't take Inputs as size is less than 1!");
		} catch (InputMismatchException e) {
			System.out.println("Sorry! This is not the Specified Input!");
		}
	}

	private static void selectionSort(int size, int[] selectionSort) {
		for (int i = 0; i < size - 1; i++) {
			int minElementIndex = i;
			for(int j = i + 1; j < size; j++){
				if(selectionSort[minElementIndex] > selectionSort[j]){
					minElementIndex = j;
				}
			}
			int temp = selectionSort[minElementIndex];
			selectionSort[minElementIndex] = selectionSort[i];
			selectionSort[i] = temp;
		}
	}
}