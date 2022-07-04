package OOP.UsingClasses.InterfaceExample1GamingConsole;

public class Chess implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Moving Piece Up!");
    }

    @Override
    public void down() {
        System.out.println("Moving Piece Down!");
    }

    @Override
    public void left() {
        System.out.println("Moving Piece Left!");
    }

    @Override
    public void right() {
        System.out.println("Moving Piece Right!");
    }
}