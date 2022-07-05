package JavaStreams.StreamsUsingLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Printing Array using Stream:
        Integer[] score = new Integer[]{80, 66, 73, 92, 43};
        Stream<Integer> scoresStream = Arrays.stream(score);
        List<Integer> scoresStreamSorted = scoresStream.sorted().filter(s-> s > 70).toList();
        System.out.println(Arrays.toString(score));
        System.out.println(scoresStreamSorted);

        // Storing Stream and Printing them:
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");

        Stream<String> shoppingListStream = shoppingList.stream();
        List<String> sortedShoppingList = shoppingListStream.sorted()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("P")).toList();
        System.out.println(shoppingList);
        System.out.println(sortedShoppingList);

        Stream<String> letterStream = Stream.of("a", "b", "c", "d");
    }
}