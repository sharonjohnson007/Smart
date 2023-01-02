package main.java;

/**
 * The interface Figure specifies the behaviors of the  subclasses.
 */

public interface Figure {
    public static void main(String[] args) {
        Figure s1 = new Rect(1, 2);  // upcast
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());
        Figure s2 = new Square(3, 4);  // upcast
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());
    }

    double getArea();
}
