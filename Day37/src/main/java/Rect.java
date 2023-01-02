package main.java;
/**
 * The subclass Rect needs to implement all the abstract methods in Shape
 */

public class Rect implements Figure {
    private int length, width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
