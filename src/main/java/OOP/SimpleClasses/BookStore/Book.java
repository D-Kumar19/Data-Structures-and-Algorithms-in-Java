package OOP.SimpleClasses.BookStore;

public class Book {
    private String name;
    private int numberOfCopies;

    Book(String name, int numberOfCopies) {
        this.name = name;
        this.numberOfCopies = numberOfCopies;
    }

    String getName() {
        return name;
    }
    int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        if (numberOfCopies >= 0) {
            this.numberOfCopies = numberOfCopies;
        }
    }
}