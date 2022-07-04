package OOP.UsingClasses.AbstractExampleRecipeBook;

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