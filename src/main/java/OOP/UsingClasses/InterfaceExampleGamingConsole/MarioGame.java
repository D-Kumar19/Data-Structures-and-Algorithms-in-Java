package OOP.UsingClasses.InterfaceExampleGamingConsole;

public class MarioGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Moving Up!");
    }

    @Override
    public void down() {
        System.out.println("Moving Down!");
    }

    @Override
    public void left() {
        System.out.println("Moving Left!");
    }

    @Override
    public void right() {
        System.out.println("Moving Right!");
    }
}