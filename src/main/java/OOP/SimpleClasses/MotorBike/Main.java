package OOP.SimpleClasses.MotorBike;

public class Main {
    public static void main(String[] args) {
        MotorBike Ducati = new MotorBike("Ducat", 120, 4);
        MotorBike honda = new MotorBike("Honda", 180, 5);
        Ducati.start();
        Ducati.setSpeed(Ducati.getSpeed() - 150);
        System.out.println("Speed of " + Ducati.getName() + " and it's speed is: " + Ducati.getSpeed());
        honda.start();
    }
}