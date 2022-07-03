package OOP.UsingClasses.MotorBike;

public class MotorBike {
    private String name;
    private float speed;
    private int gears;

    MotorBike(String name, float speed, int gears) {
        this.name = name;
        this.speed = speed;
        this.gears = gears;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setSpeed(float speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }
    public void setGears(int gears) {
        if (gears > 0) {
            this.gears = gears;
        }
    }


    public String getName() {
        return name;
    }
    public float getSpeed() {
        return speed;
    }
    public int getGears() {
        return gears;
    }

    void start() {
        System.out.println(name + " starting!");
    }
}