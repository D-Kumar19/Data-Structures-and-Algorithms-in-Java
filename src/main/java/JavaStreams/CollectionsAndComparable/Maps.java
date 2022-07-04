package JavaStreams.CollectionsAndComparable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("A", 10,
                "B", 8,
                "C", 5);
        System.out.println("Map Properties: ");
        System.out.println("Our Map: " + map1);
        System.out.println("Value for A: " + map1.get("A"));
        System.out.println("Value for D (doesn't exists): " + map1.get("D"));
        System.out.println("Size: " + map1.size());
        System.out.println("Empty: " + map1.isEmpty());
        System.out.println("Contains Key 'B': " + map1.containsKey("B"));
        System.out.println("Contains Key 'E': " + map1.containsKey("E"));
        System.out.println("Contains Value '8': " + map1.containsValue(8));
        System.out.println("Contains Value '3': " + map1.containsValue(3));
        System.out.println("Key Set: " + map1.keySet());
        System.out.println("Values: " + map1.values());

        // HashMap:
        System.out.println();
        Map<String, Integer> hashMap = new HashMap<>(map1);
        System.out.println("Map: " + hashMap);
        System.out.println("Putting 'D' and 3: " + hashMap.put("D", 3));
        System.out.println(hashMap);
        System.out.println("Putting 'C' and 65: " + hashMap.put("C", 65));
        System.out.println(hashMap);

        // LinkedHashMap:
        System.out.println();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        System.out.println("Map: " + linkedHashMap);
        System.out.println("Putting 'F' and 100: " + linkedHashMap.put("F", 100));
        System.out.println(linkedHashMap);
        System.out.println("Putting 'R' and 99: " + linkedHashMap.put("R", 99));
        System.out.println(linkedHashMap);
        System.out.println("Putting 'B' and 56: " + linkedHashMap.put("B", 56));
        System.out.println(linkedHashMap);
        System.out.println("Putting 'P' and 89: " + linkedHashMap.put("P", 89));
        System.out.println(linkedHashMap);

        // TreeMap:
        System.out.println();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("Map: " + treeMap);
        System.out.println("Putting 'F' and 100: " + treeMap.put("F", 100));
        System.out.println(treeMap);
        System.out.println("Putting 'R' and 99: " + treeMap.put("R", 99));
        System.out.println(treeMap);
        System.out.println("Putting 'B' and 56: " + treeMap.put("B", 56));
        System.out.println(treeMap);
        System.out.println("Putting 'P' and 89: " + treeMap.put("P", 89));
        System.out.println(treeMap);

        System.out.println("\nProperties of Navigable Map: ");
        System.out.println("Higher Key of B (Greater than): " + treeMap.higherKey("B"));
        System.out.println("Ceiling Key of B (Greater than or Equals to): " + treeMap.ceilingKey("B"));
        System.out.println("Lower Key of F (Lower than): " + treeMap.lowerKey("F"));
        System.out.println("Floor Key of F (Less than or Equals to): " + treeMap.floorKey("F"));
        System.out.println("First Input Key: " + treeMap.firstKey());
        System.out.println("Last Input Key: " + treeMap.lastKey());
        System.out.println("First Input Entry: " + treeMap.firstEntry());
        System.out.println("Last Input Entry: " + treeMap.lastEntry());
        System.out.println("Sub-Map from C to R Exclusive: " + treeMap.subMap("C", "R"));
        System.out.println("Sub-Map from C to R Inclusive: " + treeMap.subMap("C", true, "R", true));


        // Exercises:
        // Character Occurrences:
        System.out.println();
        String find = "This is an awesome occasion. This has never happened before.";
        HashMap<Character, Integer> characterOccurrence = new HashMap<>();
        for (int i = 0; i < find.length(); i++) {
            characterOccurrence.put(find.charAt(i), characterOccurrence.getOrDefault(find.charAt(i), 0) + 1);
        }
        System.out.println("Character Occurrences: " + characterOccurrence);

        System.out.println();
        HashMap<String, Integer> wordOccurrence = new HashMap<>();
        // Method # 01:
        /*
        int s = 0;
        for (int i = 0; i < find.length(); i++) {
            if (find.charAt(i) == ' ') {
                String intermediate = find.substring(s, i);
                wordOccurrence.put(intermediate, wordOccurrence.getOrDefault(intermediate, 0) + 1);
                s = i + 1;
            }
        }

        String substring = find.substring(s);
        wordOccurrence.put(substring, wordOccurrence.getOrDefault(substring, 0) + 1);
         */

        // Method # 02: (Extra Space)
        String[] words = find.split(" ");
        for (String s : words) {
            wordOccurrence.put(s, wordOccurrence.getOrDefault(s, 0) + 1);
        }

        System.out.println("Word Occurrences: " + wordOccurrence);
    }
}