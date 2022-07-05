package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods2 {
	static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
	static Integer[] intArray = {1, 2, 3, 4, 5};
	static Boolean[] boolArray = {true, false, true};

	public static <T> List<T> arrayToList(T[] array, List<T> list) {
		for (T t : array) {
			list.add(t);
		}
		return list;
	}

	public static void main(String[] args) {
		List<Character> charList = arrayToList(charArray, new ArrayList<>());
		List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
		List<Integer> intList = arrayToList(intArray, new ArrayList<>());

		System.out.println(charList);
		System.out.println(boolList);
		System.out.println(intList);
	}
}