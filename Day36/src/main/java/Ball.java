package main.java;

import java.util.Arrays;

/**
 * The Ball class models a moving ball at (x, y) with displacement
 * per move-step of (xStep, yStep).
 */

public class Ball {
    public static void main(String[] args) {
        Ball b1 = new Ball(1, 2, 11, 12);
        System.out.println(b1);  // toString()
        b1.setX(3);
        b1.setY(4);
        b1.setXStep(13);
        b1.setYStep(14);
        System.out.println(b1);
        System.out.println("x is: " + b1.getX());
        System.out.println("y is: " + b1.getY());
        System.out.println("xStep is: " + b1.getXStep());
        System.out.println("yStep is: " + b1.getYStep());
        b1.setXY(5, 6);
        b1.setXYStep(15, 16);
        System.out.println(b1);
        System.out.println("x and y are: " + Arrays.toString(b1.getXY()));
        System.out.println("xStep and yStep are: " + Arrays.toString(b1.getXYStep()));
        System.out.println(b1.move());
        System.out.println(b1.move().move().move());
    }

    private double x, y, xStep, yStep;

    public Ball(double x, double y, double xStep, double yStep) {
        this.x = x;
        this.y = y;
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getXStep() {
        return this.xStep;
    }

    public void setXStep(double xStep) {
        this.xStep = xStep;
    }

    public double getYStep() {
        return this.yStep;
    }

    public void setYStep(double yStep) {
        this.yStep = yStep;
    }

    public String toString() {
        return "Ball@(" + x + "," + y + "),speed=(" + xStep + "," + yStep + ")";
    }

    public double[] getXY() {
        double[] results = new double[2];
        results[0] = this.x;
        results[1] = this.y;
        return results;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double[] getXYStep() {
        double[] results = new double[2];
        results[0] = this.xStep;
        results[1] = this.yStep;
        return results;
    }

    public void setXYStep(double xStep, double yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public Ball move() {
        x += xStep;
        y += yStep;
        return this;
    }
}
