package main.java;

/**
 * Example for use static variable and method.
 */

public class Oval {
    public int count = 0;
    private double radius;

    public Oval(double radius) {
        this.radius = radius;
        count++;
    }

    public static void main(String[] args) {
        Oval c1 = new Oval(1.1);
        System.out.println("count is: " + c1.count);
        Oval c2 = new Oval(2.2);
        System.out.println("count is: " + c2.count);
        Oval c3 = new Oval(3.3);
        System.out.println("count is: " + c3.count);
    }
}
