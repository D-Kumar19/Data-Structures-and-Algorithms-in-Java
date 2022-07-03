package OOP.UsingClasses.BookStore;

public class Main {
    public static void main(String[] args) {
        Book artOfComputerProgramming = new Book("Art Of Computer Programming", 200);
        Book effectiveJava = new Book("Effective Java", 8);
        Book cleanCode = new Book("Clean Code", 78);

        System.out.println("Name of the Book is: " + artOfComputerProgramming.getName() + " and it's copies available are: " + artOfComputerProgramming.getNumberOfCopies() + "!");
        System.out.println("Name of the Book is: " + effectiveJava.getName() + " and it's copies available are: " + effectiveJava.getNumberOfCopies() + "!");
        System.out.println("Name of the Book is: " + cleanCode.getName() + " and it's copies available are: " + cleanCode.getNumberOfCopies() + "!");

    }
}