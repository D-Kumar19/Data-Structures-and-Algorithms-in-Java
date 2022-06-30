package CodingChallenges.LeastExpensiveItem;

import lombok.Data;

import java.util.List;
import java.util.Optional;
import java.util.Comparator;

@Data
public class Store {
    private String name;
    private double price;
    private double discount;

    Store(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    public static Optional<Store> findLeastExpensive(List<Store> items) { return items.stream().min(Comparator.comparing(Store::getValueAfterDiscount));}

    public double getValueAfterDiscount() {return this.price - (this.price * this.discount);}

    @Override
    public String toString(){return "The Least Expensive Item is: " + this.name  + " and it's price is: " + this.price  + " and it's discount price is: " + this.getDiscount() + "!";}
}