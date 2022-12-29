package main.java;

/**
 * Types of searching methods
 */

public class Search {
    public static void main(String[] args) {
        int a[] = {10, 24, 56, 67, 78, 89, 98, 100};
        System.out.println("Using linearSearch method: "+linearSearch(a, 24));
        System.out.println("Index of the key element is: "+linearSearchIndex(a, 10));
        System.out.println("Using linearSearch method: "+binarySearch(a, 78, 0, a.length));
        System.out.println("Using linearSearch method: "+binarySearch(a, 67));
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return 0;
    }

    public static boolean binarySearch(int[] array, int key, int fromIdx, int toIdx) {
        if (fromIdx == toIdx - 1) {
            if (key == array[fromIdx]) {
                return true;
            } else {
                return false;
            }
        } else {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key == array[middleIdx]) {
                return true;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx;
            } else {
                fromIdx = middleIdx + 1;
            }
        }
        return binarySearch(array, key, fromIdx, toIdx);
    }

    public static boolean binarySearch(int[] array, int key) {
        int fromIdx = 0;
        int toIdx = array.length - 1;
        while (fromIdx <= toIdx) {
            int middleIdx = (fromIdx + toIdx) / 2;
            if (key > array[middleIdx]) {
                fromIdx = middleIdx + 1;
            } else if (key < array[middleIdx]) {
                toIdx = middleIdx - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}