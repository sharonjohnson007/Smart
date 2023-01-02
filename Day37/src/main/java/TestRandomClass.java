package main.java;

import java.util.Random;

/**
 * Example to use Math.random() method.
 */

public class TestRandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; ++i) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();
        System.out.println(random.nextDouble());
        System.out.println(random.nextFloat());
        Random anotherRandom = new Random(12345);
        for (int i = 0; i < 10; ++i) {
            System.out.print(anotherRandom.nextInt(100) + " ");
        }
        System.out.println();
    }
}
