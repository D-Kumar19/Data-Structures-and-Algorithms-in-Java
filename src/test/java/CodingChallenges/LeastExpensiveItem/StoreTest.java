package CodingChallenges.LeastExpensiveItem;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    @Test
    public void findLeastExpensive() {
        Store leastExpensive = new Store("Dress", 34.99, .75);
        List<Store> items = List.of(
                leastExpensive,
                new Store("T-Shirt", 19.99, .4),
                new Store("Record Player", 92.99, .75),
                new Store("Hat", 23.99, .1),
                new Store("Jeans", 54.99, .65));
        assertEquals(Optional.of(leastExpensive), Store.findLeastExpensive(items));
    }

    @Test
    public void findLeastExpensive_emptyItems() {
        List<Store> items = List.of();
        assertEquals(Optional.empty(), Store.findLeastExpensive(items));
    }

    @Test
    public void findLeastExpensive_oneItem() {
        Store leastExpensive = new Store("Hat", 23.99, .1);
        List<Store> items = List.of(leastExpensive);
        assertEquals(Optional.of(leastExpensive), Store.findLeastExpensive(items));
    }

    @Test
    public void findLeastExpensive_sameItems() {
        Store leastExpensive = new Store("T-Shirt", 19.99, .4);
        List<Store> items = List.of(leastExpensive, leastExpensive, leastExpensive);
        assertEquals(Optional.of(leastExpensive), Store.findLeastExpensive(items));
    }

    @Test
    public void findLeastExpensive_sameItemsDifferentDiscounts() {
        Store leastExpensive = new Store("T-Shirt", 19.99, .9);
        Store secondLeastExpensive = new Store("T-Shirt", 19.99, .7);
        Store thirdLeastExpensive = new Store("T-Shirt", 19.99, .6);
        List<Store> items = List.of(thirdLeastExpensive, secondLeastExpensive, leastExpensive);
        assertEquals(Optional.of(leastExpensive), Store.findLeastExpensive(items));
    }

    @Test
    void testToString() {
        Store recordPlayerItem = new Store("Record Player", 108.50, .65);
        assertEquals("The Least Expensive Item is: " + recordPlayerItem.getName()  + " and it's price is: " + recordPlayerItem.getPrice(), recordPlayerItem.toString());
    }

    @Test
    void setName() {
        Store recordPlayerItem = new Store("Record Player", 108.50, .65);
        assertEquals("Record Player", recordPlayerItem.getName());

        recordPlayerItem.setName("Pink Record Player");
        assertEquals("Pink Record Player", recordPlayerItem.getName());
    }

    @Test
    void setPrice() {
        Store recordPlayerItem = new Store("Record Player", 108.50, .65);
        assertEquals(108.50, recordPlayerItem.getPrice());

        recordPlayerItem.setPrice(99.99);
        assertEquals(99.99, recordPlayerItem.getPrice());
    }

    @Test
    void setDiscount() {
        Store recordPlayerItem = new Store("Record Player", 108.50, .65);
        assertEquals(.65, recordPlayerItem.getDiscount());

        recordPlayerItem.setDiscount(.75);
        assertEquals(.75, recordPlayerItem.getDiscount());
    }
}