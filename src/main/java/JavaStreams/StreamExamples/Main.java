package JavaStreams.StreamExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Banana");
        arrayList.add("Owl");
        arrayList.add("Bat");

        // Using Loop:
        System.out.print("Using Loop: ");
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

        // Using Streams:
        // Example # 01:
        System.out.print("\nUsing Stream: ");
        arrayList.forEach(element -> System.out.print(element + " "));

        // Example # 02: (Filtering)
        System.out.print("\nUsing Stream with Filter: ");
        arrayList.stream()
                .filter(element -> !element.endsWith("at"))
                .forEach(element -> System.out.print(element + " "));

        // Example # 03: (Addition)
        List<Integer> list = List.of(1, 4, 7, 9, 45, 12, 8, 4, 1);
        System.out.print("\n" + list);
        int sum1 = list.stream().reduce(0, (number1, number2) -> number1 + number2);
        System.out.println(" Sum of all Numbers: " + sum1);

        // Example # 04: (Print Odd Numbers)
        System.out.print(list + " Printing Odd Numbers: ");
        list.stream().filter(element -> element % 2 != 0).forEach(element -> System.out.print(element + " "));

        // Example # 05: (Sum of Odd Numbers Only)
        int sum2 = list.stream().filter(element -> element % 2 != 0).reduce(0, (element1, element2) -> element1 + element2);
        System.out.print("\n" + list + " Sum of Odd Numbers: " + sum2);

        // Example 06: (Sorting)
        System.out.print("\n" + list + " Sorted List: ");
        list.stream().sorted().forEach(element -> System.out.print(element + " "));

        // Example 07: (Distinct Element Sorted)
        System.out.print("\n" + list + " Distinct Element Sorted List: ");
        list.stream().distinct().sorted().forEach(element -> System.out.print(element + " "));

        // Example 08: (Distinct Element Sorted and Square)
        System.out.print("\n" + list + " Distinct Element Sorted Squared List: ");
        list.stream().distinct().sorted().map(element -> element * element).forEach(element -> System.out.print(element + " "));

        // Example 09: (Square of first 10 Numbers)
        System.out.print("\nSquare of first 10 Numbers: ");
        IntStream.range(1, 11).map(element -> element * element).forEach(element -> System.out.print(element + " "));

        // Example # 10: (Print to LowerCase)
        System.out.print("\nUsing Stream Print to LowerCase: ");
        arrayList.stream().map(element -> element.toLowerCase(Locale.ROOT)).forEach(element -> System.out.print(element + " "));

        // Example # 11: (Print Length of String)
        System.out.print("\nUsing Stream Print the Length: ");
        arrayList.forEach(element -> System.out.print(element + " " + element.length() + " "));

        // Example # 12: (Print Maximum Element)
        // Optional<Integer> maxValue = list.stream().max((element1, element2) -> Integer.compare(element1, element2));
        Optional<Integer> maxValue = list.stream().max(Integer::compare);
        System.out.print("\nMax value using Stream: " + maxValue);

        // Example # 13: (Print Minimum Element)
        Optional<Integer> minValue = list.stream().min(Integer::compare);
        System.out.print("\nMin value using Stream: " + minValue);

        // Example # 14: (Get List of Odd Numbers Only)
        List<Integer> oddNumbers = list.stream().filter(element -> element % 2 != 0).collect(Collectors.toList());
        System.out.print("\nOdd Numbers List using Stream: " + oddNumbers);

        // Example # 15: (Squares of first 10 Numbers)
        List<Integer> squares = IntStream.range(1, 11).map(element -> element * element).boxed().collect(Collectors.toList());
        System.out.print("\nSquares of first 10 Numbers using Streams: " + squares);

        // Example # 16: (Using orElse() for Even Numbers)
        List<Integer> integerList = List.of(1, 3, 5, 7, 9, 11, 13);
        int max = integerList.stream().filter(element -> element % 2 == 0).max((element1, element2) -> Integer.compare(element1, element2)).orElse(-1);
        System.out.print("\nMaximum value is: " + max);

        // Example # 17: (Print to UpperCase)
        System.out.print("\nUsing Stream Print to UpperCase: ");
        arrayList.stream().map(new EvenNumberPredicate()).forEach(element -> System.out.print(element + " "));
    }

    static class EvenNumberPredicate implements Function<String, String> {
        @Override
        public String apply(String s) {
            return s.toUpperCase(Locale.ROOT);
        }
    }
}