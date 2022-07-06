package DataStrcuturesAndAlgorithms.SearchingAlgorithms;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		// O(n) Time Complexity
		System.out.println("This Program will find an Element using Linear Search!");

		int size;
		Scanner input = new Scanner(System.in);
		try {
			System.out.print("Enter size of the Array: ");
			size = input.nextInt();

			if(size > 0) {
				int[] linearSearch = new int[size];
				for (int i = 0; i < size; i++) {
					System.out.print("Enter element # " + (i + 1) + ": ");
					linearSearch[i] = input.nextInt();
				}

				System.out.println("\nArray that you just Inputted: \n" + Arrays.toString(linearSearch));

				int elementToFind;
				System.out.print("\nEnter the Element you want to Search: ");
				elementToFind = input.nextInt();

				int elementIndex = linearSearch(size, linearSearch, elementToFind);
				if(elementIndex != -1) System.out.println(elementToFind + " is at Index: " + elementIndex);
				else System.out.println(elementToFind + " is not in the Array!");
			}
			else System.out.println("Can't take Inputs as size is less than 1!");
		} catch (InputMismatchException e) {
			System.out.println("Sorry! This is not the Specified Input!");
		}
	}

	private static int linearSearch(int size, int[] linearSearch, int elementToFind) {
		int elementIndex = -1;
		for (int i = 0; i < size; i++) {
			if (linearSearch[i] == elementToFind) {
				elementIndex = i;
				break;
			}
		}
		return elementIndex;
	}
}