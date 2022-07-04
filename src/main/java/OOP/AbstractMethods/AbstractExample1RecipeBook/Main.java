package OOP.AbstractMethods.AbstractExample1RecipeBook;

public class Main {
    public static void main(String[] args) {
        Biryani b1 = new Biryani();
        b1.execute();

        System.out.println();
        FrozenPizza f1 = new FrozenPizza();
        f1.execute();
    }
}