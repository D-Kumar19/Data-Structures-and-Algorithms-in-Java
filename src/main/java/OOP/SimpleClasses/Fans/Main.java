package OOP.SimpleClasses.Fans;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan("Manufacturer 1", 12.2, "Black");
        System.out.println(fan1);

        fan1.switchOn();
        System.out.println(fan1);
        fan1.switchOff();
        System.out.println(fan1);

        fan1.setSpeed(5);
        fan1.switchOn();
        System.out.println(fan1);
        fan1.switchOff();
        System.out.println(fan1);
    }
}