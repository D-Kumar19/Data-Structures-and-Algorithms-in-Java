package OOP.UsingClasses.BookExtended;

public class Main {
    public static void main(String[] args) {
        BookExtended book = new BookExtended(123, "Object Oriented Programming with Java", "Ranga");
        System.out.println(book);
        book.addReview(new Review(10, "Great Book", 5));
        System.out.println(book);
        book.addReview(new Review(101, "Awesome Book", 5));
        System.out.println(book);
    }
}