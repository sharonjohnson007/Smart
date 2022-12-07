package main.java;

import java.util.Scanner;

/**
 * To compute area,circumference,diameter of circle which prompts user for the radius of a circle
 */
public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.printf("Diameter is: %.2f%n", diameter);
        System.out.printf("Area is: %.2f%n", area);
        System.out.printf("Circumference is: %.2f%n", circumference);
    }
}
