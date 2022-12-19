package main.java;

import java.util.Arrays;

/**
 * Different array methods.
 */
public class ArrayNdMethods {
    public static void main(String[] args) {
        int[] a = {16, 45, 98, 23, 67};
        System.out.println("After converting array to string: ");
        arrayToString(a);
        int[] b = {12, 65, 43, 98};
        System.out.println("Using contains method " + contains(b, 12));
        System.out.println("Using search method " + search(b, 43));
        int[] c = {1, 2, 3, 4, 5};
        int[] d = {1, 2, 3, 5, 4};
        int[] e = {6, 7, 8, 9, 0,};
        System.out.println("Using equal method " + equals(c, d));
        System.out.println("Using copying method: ");
        System.out.println(Arrays.toString(copyOf(a)));
        System.out.println("After reversing: ");
        reverse(c);
        System.out.println("Using swap method " + swap(c, e));
        System.out.println("Using copyOf method with new length " + Arrays.toString(copyOf(a, 8)));
    }

    public static String arrayToString(int[] array) {
        String[] outputStr = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            outputStr[i] = String.valueOf(array[i]);
        }
        System.out.println(Arrays.toString(outputStr));
        return Arrays.toString(outputStr);

    }

    public static boolean contains(int[] array, int key) {
        for (int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return key;
    }

    public static boolean equals(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] copyOf(int[] array) {
        int[] copyOfArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copyOfArray[i] = Integer.parseInt(String.valueOf(array[i]));
        }
        return copyOfArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copy = Arrays.copyOf(array, newLength);
        return copy;
    }

    public static boolean swap(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                int temp = array1[i];
                array1[i] = array2[j];
                array2[j] = temp;
                if (array1.length == array2.length) {
                    if (array1[i] != array2[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void reverse(int[] array) {
        for (int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; ++fIdx, --bIdx) {
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
