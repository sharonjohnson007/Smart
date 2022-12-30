package main.java;

/**
 * A Cylinder is a Circle plus a height.
 */

public class Cylinder extends Circle {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        System.out.println("Radius is " + cy1.getRadius()
                + ", Height is " + cy1.getHeight()
                + ", Color is " + cy1.getColor()
                + ", Base area is " + cy1.getArea()
                + ", Volume is " + cy1.getVolume());
        Cylinder cy2 = new Cylinder(5.0, 2.0);
        System.out.println("Radius is " + cy2.getRadius()
                + ", Height is " + cy2.getHeight()
                + ", Color is " + cy2.getColor()
                + ", Base area is " + cy2.getArea()
                + ", Volume is " + cy2.getVolume());
    }

    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");
    }

    public Cylinder(double height) {
        super();
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ",height=" + height + "]";
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

}
