package OOP.Abstraction.Interfaces.InterfaceExample3Flyable;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flies because of Wings!");
    }
}