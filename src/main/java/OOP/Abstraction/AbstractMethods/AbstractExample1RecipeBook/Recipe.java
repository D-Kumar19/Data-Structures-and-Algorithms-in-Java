package OOP.Abstraction.AbstractMethods.AbstractExample1RecipeBook;

public abstract class Recipe {
    public void execute() {
        getReady();
        doTheDishes();
        cleanUp();
    }

    abstract void getReady();

    abstract void doTheDishes();

    abstract void cleanUp();
}