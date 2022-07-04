package OOP.UsingClasses.InterfaceExampleGamingConsole;

public class Main {
    public static void main(String[] args) {
        GamingConsole mg1 = new MarioGame();
        mg1.right();
        mg1.left();
        mg1.up();
        mg1.down();

        System.out.println();
        GamingConsole ch1 = new Chess();
        ch1.right();
        ch1.left();
        ch1.up();
        ch1.down();
    }
}