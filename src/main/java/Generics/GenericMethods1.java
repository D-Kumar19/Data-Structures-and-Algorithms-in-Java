package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods1 {
    public static void main(String[] args) {
        // Using Generics for Methods:
        String value = GenericMethods1.getValue("");
        Integer number = GenericMethods1.getValue(5);
        ArrayList<String> list5 = GenericMethods1.getValue(new ArrayList<>());

        System.out.println();
        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        GenericMethods1.duplicate(numbers);
        System.out.println("After Duplicating the List: " + numbers);

    }
    private static <T> T getValue(T value) {
        return value;
    }

    private static <T extends List> void duplicate(T list) {
        list.addAll(list);
    }
}