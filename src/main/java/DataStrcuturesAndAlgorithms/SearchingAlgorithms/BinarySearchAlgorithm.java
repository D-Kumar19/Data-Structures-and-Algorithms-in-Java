package DataStrcuturesAndAlgorithms.SearchingAlgorithms;

import DataStrcuturesAndAlgorithms.SortingMethods.InsertionSortAlgorithm;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		// O(log2(n)) Time Complexity
		System.out.println("This Program will find an Element using Binary Search!");

		int size;
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter size of the Array: ");
			size = input.nextInt();

			if(size > 0) {
				int[] binarySearch = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.print("Enter element # " + (i + 1) + ": ");
					binarySearch[i] = input.nextInt();
				}

				System.out.println("\nArray that you just Inputted: \n" + Arrays.toString(binarySearch));
				InsertionSortAlgorithm.insertionSort(size, binarySearch);
				System.out.println("\nArray after Sorting was performed: \n" + Arrays.toString(binarySearch));
				int elementToFind;
				System.out.print("\nEnter the Element you want to Search: ");
				elementToFind = input.nextInt();


				int elementIndex = binarySearch(size, binarySearch, elementToFind);

				if(elementIndex != -1) System.out.println(elementToFind + " is at Index: " + elementIndex);
				else System.out.println(elementToFind + " is not in the Array!");
			}
			else System.out.println("Can't take Inputs as size is less than 1!");
		} catch (InputMismatchException e) {
			System.out.println("Sorry! This is not the Specified Input!");
		}
	}

	private static int binarySearch(int size, int[] binarySearch, int elementToFind) {
		int left = 0;
		int right = size - 1;
		while(left <= right){
			int mid = (left + right)/2;

			if(binarySearch[mid] == elementToFind) return mid;
			else if(binarySearch[mid] > elementToFind) right = mid - 1;
			else left = mid + 1;
		}
		return -1;
	}
}