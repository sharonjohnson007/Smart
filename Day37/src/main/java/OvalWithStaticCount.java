package main.java;

/**
 * Example for use static variable.
 */

public class OvalWithStaticCount {
    public static int count = 0;
    private double radius;

    public OvalWithStaticCount(double radius) {
        this.radius = radius;
        ++count;
    }

    public static void main(String[] args) {
        OvalWithStaticCount c1 = new OvalWithStaticCount(1.1);
        System.out.println("count is: " + c1.count);
        System.out.println("count is: " + OvalWithStaticCount.count);
        OvalWithStaticCount c2 = new OvalWithStaticCount(2.2);
        System.out.println("count is: " + OvalWithStaticCount.count);
        System.out.println("count is: " + c1.count);
        System.out.println("count is: " + c2.count);
        OvalWithStaticCount c3 = new OvalWithStaticCount(3.3);
        System.out.println("count is: " + OvalWithStaticCount.count);
        System.out.println("count is: " + c1.count);
        System.out.println("count is: " + c2.count);
        System.out.println("count is: " + c3.count);
    }
}
