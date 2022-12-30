package main.java;

import java.util.Arrays;

/**
 * A Line composes of two Points - a begin "Point" and an end "Point".
 * We reuse the Point class.
 */

public class Line {
    public static void main(String[] args) {
        Line l1 = new Line(1, 2, 3, 4);
        System.out.println(l1);
        Line l2 = new Line(new Point(5, 6), new Point(7, 8));
        System.out.println(l2);
        l1.setBegin(new Point(11, 12));
        l1.setEnd(new Point(13, 14));
        System.out.println(l1);
        System.out.println("begin is: " + l1.getBegin());
        System.out.println("end is: " + l1.getEnd());
        l1.setBeginX(21);
        l1.setBeginY(22);
        l1.setEndX(23);
        l1.setEndY(24);
        System.out.println(l1);
        System.out.println("begin's x is: " + l1.getBeginX());
        System.out.println("begin's y is: " + l1.getBeginY());
        System.out.println("end's x is: " + l1.getEndX());
        System.out.println("end's y is: " + l1.getEndY());
        l1.setBeginXY(31, 32);
        l1.setEndXY(33, 34);
        System.out.println(l1);
        System.out.println("begin's x and y are: " + Arrays.toString(l1.getBeginXY()));
        System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));
        System.out.printf("length is: %.2f%n", l1.getLength());

    }

    Point begin, end;

    public Line(int x1, int y1, int x2, int y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public String toString() {
        return "Line[begin=" + begin + ",end=" + end + "]";

    }

    public double getLength() {
        return begin.distance(end);
    }
}
