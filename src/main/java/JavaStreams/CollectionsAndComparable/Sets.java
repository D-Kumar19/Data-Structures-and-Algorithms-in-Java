package JavaStreams.CollectionsAndComparable;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        // HashSet, LinkedHashSet, TreeSet:
        Set<Integer> set1 = new HashSet<>();
        set1.add(7845);
        set1.add(1245);
        set1.add(5451);
        set1.add(451);
        set1.add(76);
        System.out.println("Random Order: " + set1);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(7845);
        set2.add(1245);
        set2.add(5451);
        set2.add(451);
        set2.add(76);
        System.out.println("In-order of adding Elements:" + set2);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(7845);
        set3.add(1245);
        set3.add(5451);
        set3.add(451);
        set3.add(76);
        System.out.println("Sorted: " + set3);

        System.out.println();
        List<Character> characterList = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        // Random Order:
        Set<Character> sortedSet3 = new HashSet<>(characterList);
        System.out.println("Random Order: " + sortedSet3);

        // In-order of adding Elements:
        Set<Character> sortedSet2 = new LinkedHashSet<>(characterList);
        System.out.println("In-order of adding Elements:" + sortedSet2);

        // Sorted:
        Set<Character> sortedSet1 = new TreeSet<>(characterList);
        System.out.println("Sorted: " + sortedSet1);

        System.out.println("\nTree-Set Properties: ");
        TreeSet<Integer> numbers = new TreeSet<>(Set.of(65, 54, 34, 12, 99));
        System.out.println(numbers);
        System.out.println("Floor of 40: " + numbers.floor(40));
        System.out.println("Lower than 12: " + numbers.lower(14));
        System.out.println("Higher than 64" + numbers.higher(64));
        System.out.println("Last Number: " + numbers.last());
        System.out.println("First Number: " + numbers.first());
        System.out.println("Subset of 20 and 80: " + numbers.subSet(20, 80));
        System.out.println("Subset of 20 and 34: " + numbers.subSet(20, 34));
        System.out.println("Subset of 20 and 34 Inclusive: " + numbers.subSet(20, true, 34, true));
        System.out.println("All elements before 50: " + numbers.headSet(50));
        System.out.println("All elements after 50: " + numbers.tailSet(50));
    }
}