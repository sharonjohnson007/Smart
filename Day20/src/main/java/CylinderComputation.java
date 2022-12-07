package main.java;

import java.util.Scanner;

/**
 * To compute surfaceArea,volume,baseArea of cylinder which prompts user for the radius and height of a cylinder
 */

public class CylinderComputation {
    public static void main(String[] args) {
        double surfaceArea, volume, baseArea, radius, height;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = in.nextDouble();
        baseArea = Math.PI * radius * radius;
        surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
        System.out.printf("Surface area is: %.2f%n", surfaceArea);
        System.out.printf("BaseArea is: %.2f%n", baseArea);
        System.out.println("Enter the height: ");
        height = in.nextDouble();
        volume = baseArea * height;
        System.out.printf("Volume is: %.2f%n", volume);
    }
}
