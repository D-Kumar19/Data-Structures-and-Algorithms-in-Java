package OOP.SimpleClasses.Fans;

public class Fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private byte speed;

    Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    void switchOn() {
        if (!isOn) {
            isOn = true;
        }
    }

    void switchOff() {
        isOn = false;
        speed = 0;

    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = (byte) speed;
    }

    @Override
    public String toString() {
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d", make, radius, color, isOn, speed);
    }
}
