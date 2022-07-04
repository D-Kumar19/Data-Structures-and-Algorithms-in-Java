package OOP.UsingClasses.RectangleProperties;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(12.2, 14.5);
        Main.printResults(r1);
        r1.setWidth(15);
        Main.printResults(r1);
        r1.setLength(18);
        Main.printResults(r1);
    }

    private static void printResults(Rectangle r1) {
        System.out.println();
        System.out.println("Area of Rectangle: " + r1.findArea());
        System.out.println("Perimeter of Rectangle: " + r1.findPerimeter());
        System.out.println(r1);
    }
}