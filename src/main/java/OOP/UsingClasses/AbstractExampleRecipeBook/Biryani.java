package OOP.UsingClasses.AbstractExampleRecipeBook;

public class Biryani extends Recipe {
    @Override
    void getReady() {
        System.out.println("Cut Onions!");
        System.out.println("Clean Chicken!");
        System.out.println("Make Chicken Curry!");
        System.out.println("Boil Rice!");
        System.out.println("Heat Rice and Curry together for 10 minutes!");
    }

    @Override
    void doTheDishes() {
        System.out.println("Wash the Dishes!");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean all the mess you had done!");
    }
}