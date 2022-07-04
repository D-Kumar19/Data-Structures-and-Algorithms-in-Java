package OOP.UsingClasses.BookExtended;

import java.util.ArrayList;

public class BookExtended {
    private int id;
    private String name;
    private String author;
    private ArrayList<Review> review = new ArrayList<>();

    BookExtended(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    void addReview(Review review) {
        this.review.add(review);
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Name: %s, Author: %s, Review: %s", id, name, author, review);
    }
}