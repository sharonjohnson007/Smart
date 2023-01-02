package main.java;

/**
 * The subclass Square need to implement all the abstract methods in Figure.
 */

public class Square implements Figure {
    private int length, breath;

    /**
     * Constructs a Triangle instance with the given base and height
     */
    public Square(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    /**
     * Returns a self-descriptive string
     */
    @Override
    public String toString() {
        return "Square[length=" + length + ",breath=" + breath + "]";
    }

    // Need to implement all the abstract methods defined in the interface

    /**
     * Returns the area of this triangle
     */
    @Override
    public double getArea() {
        return length * breath;
    }
}
