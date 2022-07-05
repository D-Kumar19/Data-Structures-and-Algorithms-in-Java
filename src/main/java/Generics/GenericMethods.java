package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        // Using Generics for Methods:
        String value = GenericMethods.getValue("");
        Integer number = GenericMethods.getValue(5);
        ArrayList<String> list5 = GenericMethods.getValue(new ArrayList<>());

        System.out.println();
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        GenericMethods.duplicate(numbers);
        System.out.println("After Duplicating the List: " + numbers);

    }
    private static <T> T getValue(T value) {
        return value;
    }

    private static <T extends List> void duplicate(T list) {
        list.addAll(list);
    }
}