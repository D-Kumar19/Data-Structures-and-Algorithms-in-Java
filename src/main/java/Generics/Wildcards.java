package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        // Wildcards (Again restricting it for Numbers)
        // Upper Bound:
        System.out.println();
        // ArrayList<String> stl = new ArrayList<>();
        // sumOfNumberList(stl); // Again will not work!
        ArrayList<Float> floatList = new ArrayList<>(List.of(12.53f, 14.56f, 458.78f, 7851.12f));
        float sum1 = Wildcards.sumOfNumberList(floatList).floatValue();

        ArrayList<Double> doubleList = new ArrayList<>(List.of(12.53, 14.56, 458.78, 7851.12));
        double sum2 = Wildcards.sumOfNumberList(doubleList).doubleValue();

        ArrayList<Integer> integerList = new ArrayList<>(List.of(12, 14, 45, 785));
        int sum3 = Wildcards.sumOfNumberList(integerList).intValue();

        ArrayList<Long> longList = new ArrayList<>(List.of(12L, 146L, 458L, 7851L));
        long sum4 = Wildcards.sumOfNumberList(longList).longValue();

        System.out.println("List: " + floatList + " Sum: " + sum1);
        System.out.println("List: " + doubleList + " Sum: " + sum2);
        System.out.println("List: " + integerList + " Sum: " + sum3);
        System.out.println("List: " + longList + " Sum: " + sum4);


        // Lower Bound:
        System.out.println();
        ArrayList<Number> list = new ArrayList<>();
        Wildcards.addCoupleOfNumbers(list);
        System.out.println(list);
    }

    private static Number sumOfNumberList(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    private static void addCoupleOfNumbers(List<? super Number> numbers) {
        numbers.add(12);
        numbers.add(12.2f);
        numbers.add(12.2451);
        numbers.add(1245L);
    }
}