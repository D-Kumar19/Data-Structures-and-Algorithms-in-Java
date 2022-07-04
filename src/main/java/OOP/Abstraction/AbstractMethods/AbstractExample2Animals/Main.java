package OOP.Abstraction.AbstractMethods.AbstractExample2Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
