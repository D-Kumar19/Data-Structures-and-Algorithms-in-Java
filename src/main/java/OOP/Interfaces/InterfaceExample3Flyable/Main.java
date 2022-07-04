package OOP.UsingClasses.Interfaces.InterfaceExample3Flyable;

public class Main {
    public static void main(String[] args) {
        Flyable[] flyable = {new Bird(), new Aeroplane()};
        for (Flyable objects : flyable) {
            objects.fly();
        }
    }
}