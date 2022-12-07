package main.java;

import java.util.Scanner;

/**
 * To compute surfaceArea,volume of sphere which prompts user for the radius of a sphere
 */
public class SphereComputation {
    public static void main(String[] args) {
        double surfaceArea, volume, radius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        surfaceArea = 4 * Math.PI * radius * radius;
        volume = (1.33) * Math.PI * radius * radius * radius;
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
