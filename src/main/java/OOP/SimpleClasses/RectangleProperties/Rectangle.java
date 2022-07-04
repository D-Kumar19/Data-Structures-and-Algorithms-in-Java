package OOP.SimpleClasses.RectangleProperties;

import java.math.BigDecimal;

public class Rectangle {
    private BigDecimal length;
    private BigDecimal width;

    Rectangle(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = BigDecimal.valueOf(length);
            this.width = BigDecimal.valueOf(width);
        }
    }

    BigDecimal findPerimeter() {
        return BigDecimal.valueOf(2).multiply(length.add(width));
    }

    BigDecimal findArea() {
        return length.multiply(width);
    }

    void setLength(double length) {
        if (length > 0) {
            this.length = BigDecimal.valueOf(length);
        }
    }

    void setWidth(double width) {
        if (width > 0) {
            this.width = BigDecimal.valueOf(width);
        }
    }

    @Override
    public String toString() {
        return String.format("Length - %s, Width - %s, Perimeter - %s, Area - %s", length, width, findPerimeter(), findArea());
    }
}
