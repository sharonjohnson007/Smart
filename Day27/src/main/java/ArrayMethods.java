package main.java;

/**
 * Overloaded version of array.
 */
public class ArrayMethods {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 6};
        double[] b = {1.0879, 2.8344, 3.934, 5.787, 6.118};
        float[] c = {1.0f, 5.6f, 3.6f, 0.8f};
        print(a);
        print(b);
        print(c);
    }

    public static void print(int[] array) {
        String outputStr = "";
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                outputStr += array[i];
            } else {
                outputStr += ", " + array[i];
            }
        }
        System.out.println("[" + outputStr + "]");
    }

    public static void print(double[] array) {
        String outputStr = "";
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                outputStr += array[i];
            } else {
                outputStr += ", " + array[i];
            }
        }
        System.out.println("[" + outputStr + "]");
    }

    public static void print(float[] array) {
        String outputStr = "";
        for (int i = 0; i < array.length; ++i) {
            if (i == 0) {
                outputStr += array[i];
            } else {
                outputStr += ", " + array[i];
            }
        }
        System.out.println("[" + outputStr + "]");
    }
}
