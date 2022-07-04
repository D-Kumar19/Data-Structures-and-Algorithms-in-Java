package JavaStreams.CollectionsAndComparable;

import java.util.*;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());

        System.out.println("Poll from Null: " + queue.poll());

        // Adding Elements:
        queue.offer("Apple");
        queue.add("Hello");
        System.out.println("After Adding Elements: " + queue);

        // Adding a List:
        queue.addAll(List.of("Zebra", "Monkey", "Cat", "Dog"));
        System.out.println("After Adding a List: " + queue);

        System.out.println("\nRemoving Elements in Custom Order: ");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("\nStack:");
        Stack<String> stack = new Stack<>();

        // Adding Elements:
        stack.add("Hello");
        System.out.println("After Adding Element: " + stack);

        // Adding a List:
        stack.addAll(List.of("Zebra", "Monkey", "Cat", "Dog"));
        System.out.println("After Adding a List: " + stack);

        System.out.println("\nRemoving Elements from Stack: ");
        System.out.println(stack.pop());
        System.out.println(stack);
    }

    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return Integer.compare(o2.length(), o1.length());
        }
    }
}