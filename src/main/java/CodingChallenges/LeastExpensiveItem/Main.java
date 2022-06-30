package CodingChallenges.LeastExpensiveItem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("This program will calculate the least expensive item in a Store!");

        List<Store> items = List.of(
                new Store("T-Shirt", 19.99, .4),
                new Store("Dress", 34.99, .75),
                new Store("Record Player", 92.99, .75),
                new Store("Hat", 23.99, .1),
                new Store("Jeans", 54.99, .65));

        // First Method using Loop and getting the value:
        Store leastExpensiveItem = getLeastExpensiveItem(items);
        if(leastExpensiveItem == null) System.out.println("The list is empty!");
        else System.out.println("The Least Expensive Item is: " + leastExpensiveItem.getName() + " and it's price is: " + leastExpensiveItem.getPrice() + " and it's discount price is: " + leastExpensiveItem.getDiscount() + "!");

        // Second Method using Stream and methods in Store class:
        Optional<Store> leastExpensiveItems = Store.findLeastExpensive(items);
        leastExpensiveItems.ifPresent(System.out::println);
    }

    public static Store getLeastExpensiveItem(List<Store> items) {
        double minimumPrice = Double.MAX_VALUE;
        Store leastExpensiveItem = new Store("", 0, 0);
        for (Store s : items) {
            double price = getValueAfterDiscount(s.getPrice(), s.getDiscount());
            if(minimumPrice > price){
                minimumPrice = price;
                leastExpensiveItem = s;
            }
        }
        if(leastExpensiveItem.getName().equals("")){
            return null;
        }
        return leastExpensiveItem;
    }

    public static double getValueAfterDiscount(double price, double discount) {
        return price - (price * discount);
    }
}