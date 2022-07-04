package JavaStreams.CollectionsAndComparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Converting List from Immutable to Mutable:
        List<String> word = List.of("Apple", "Bat", "Cat");
        // word.add("Rat"); // We can't add as it is Immutable!
        System.out.println(word);

        List<String> wordArrayList = new ArrayList<>(word);
        wordArrayList.add("Rat");
        System.out.println(wordArrayList);

        List<String> wordLinkedList = new LinkedList<>(word);
        wordLinkedList.add("Rat");
        System.out.println(wordLinkedList);

        List<String> wordVector = new Vector<>(word);
        wordVector.add("Rat");
        System.out.println(wordVector);


        // Adding to ArrayList:
        wordArrayList.add("Ball");
        wordArrayList.add(2, "Boy");
        wordArrayList.add("Ball");
        wordArrayList.addAll(word);
        System.out.println(wordArrayList);


        // Removing elements from ArrayList:
        wordArrayList.set(6, "Fish");
        wordArrayList.remove(0);
        wordArrayList.remove("Rat");
        System.out.println(wordArrayList);

        // Iterator:
        // Method # 01:
        /*
        Iterator<String> wordsIterator = wordArrayList.listIterator();
        while (wordsIterator.hasNext()) {
            if (wordsIterator.next().endsWith("at")) {
                wordsIterator.remove();
            }
        }
        System.out.println(wordArrayList);
        */

        // Method # 02:
        wordArrayList.removeIf(s-> s.endsWith("at"));
        System.out.println(wordArrayList);

        // Sorting using Collections:
        Collections.sort(wordArrayList);
        System.out.println(wordArrayList);

        // Sorting using Comparable:
        List<Student> students = new ArrayList<>();
        students.add(new Student("Range", 1));
        students.add(new Student("Adam", 145));
        students.add(new Student("Eve", 100));
        System.out.println(students);

        // Method # 01:
        // Collections.sort(students);

        // Method # 02: (using Comparator)
        // Collections.sort(students, new AscendingStudentComparator());

        // Method # 03:
        students.sort(new AscendingStudentComparator());
        System.out.println(students);
    }

    static class AscendingStudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Integer.compare(o1.getId(), o2.getId());
        }
    }
}