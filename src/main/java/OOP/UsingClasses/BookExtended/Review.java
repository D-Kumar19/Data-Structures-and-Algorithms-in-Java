package OOP.UsingClasses.BookExtended;

public class Review {
    private int id;
    private String description;
    private int rating;

    Review(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Description: %s, Rating: %d", id, description, rating);
    }
}