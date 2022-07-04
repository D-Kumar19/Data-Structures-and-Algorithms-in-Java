package OOP.AbstractMethods.AbstractExample1RecipeBook;

class FrozenPizza extends Recipe {
    @Override
    void getReady() {
        System.out.println("Get the Plate");
        System.out.println("Put it in Microwave!");
        System.out.println("Microwave at 70 Degrees for 5 min!");
    }

    @Override
    void doTheDishes() {
        System.out.println("Switch off the Microwave!");
        System.out.println("Wash the Dishes!");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean all the mess you had done!");
    }
}