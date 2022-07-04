package OOP.Abstraction.Interfaces.InterfaceExample3Flyable;

public class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flies because of Fuel!");
    }
}