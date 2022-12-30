package main.java;

/**
 * To compute area and circumference of a circle
 * Parent class for class cylinder
 */

public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is: " + c1.getRadius());
        System.out.println("The color is: " + c1.getColor());
        System.out.printf("The area is: %.2f%n", c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The radius is: " + c2.getRadius());
        System.out.println("The color is: " + c2.getColor());
        System.out.printf("The area is: %.2f%n", c2.getArea());
        Circle c3 = new Circle();
        System.out.println("The radius is: " + c3.getRadius());
        System.out.println("The color is: " + c3.getColor());
        System.out.printf("The area is: %.2f%n", c3.getArea());
        Circle c4 = new Circle(5, "violet");
        System.out.println(c4.toString());
        System.out.printf("The circumference of c4 is: %.2f%n", c4.getCircumference());
        System.out.println("-----------------------------results of point and circle class--------------");
        Circle c5 = new Circle();
        System.out.println(c5);
        Circle c6 = new Circle(1, 2, 3.3);
        System.out.println(c6);
        Circle c7 = new Circle(new Point(4, 5), 6.6);
        System.out.println(c7);
        c5.setCenter(new Point(11, 12));
        c5.setRadius(13.3);
        System.out.println(c5);
        System.out.println("center is: " + c5.getCenter());
        System.out.println("radius is: " + c5.getRadius());
        c5.setCenterX(21);
        c5.setCenterY(22);
        System.out.println(c5);
        System.out.println("center's x is: " + c5.getCenterX());
        System.out.println("center's y is: " + c5.getCenterY());
        c5.setCenterXY(31, 32);
        System.out.println(c5);
        System.out.println("center's x is: " + c5.getCenterXY()[0]);
        System.out.println("center's y is: " + c5.getCenterXY()[1]);
        System.out.printf("area is: %.2f%n", c5.getArea());
        System.out.printf("circumference is: %.2f%n", c5.getCircumference());
        System.out.printf("distance is: %.2f%n", c5.distance(c6));
        System.out.printf("distance is: %.2f%n", c6.distance(c5));

    }

    public double radius;
    private Point center;
    private String color;

    public Circle() {
        this.center = new Point();
        radius = 1.0;
        color = "green";
    }

    public Circle(double r) {
        radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2.0 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

    /**
     * The Circle class composes a "Point" instance as its center and a radius.
     * We reuse the "Point" class via composition.
     */
    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter); // Construct a Point at (xCenter,yCenter)
        this.radius = radius;
    }

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    public double distance(Circle another) {
        return center.distance(another.center);
    }

}
