package main.java;

/**
 * To print the patterns using nested-loops in a class.
 */

public class PrintTriangles {
    public static void main(String[] args) {
        System.out.println("----------PowerOf2Triangle----------");
        printPowerOf2Triangle(8);
        System.out.println("----------PascalTriangle1----------");
        printPascalTriangle1(7);
        System.out.println("----------PascalTriangle2----------");
        printPascalTriangle2(7);
    }

    public static void printPowerOf2Triangle(int numRows) {
        int rowCount = 1;
        int n = 1;
        for (int i = numRows; i > 0; i--) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= rowCount; j++) {
                if (n > 100)
                    System.out.print(" " + n);
                else if (n > 10)
                    System.out.print("  " + n);
                else
                    System.out.print("   " + n);
                n = n * 2;
            }
            n = n / 2;
            for (int j = rowCount - 1; j >= 1; j--) {
                n = n / 2;
                if (n >= 100)
                    System.out.print(" " + n);
                else if (n > 10)
                    System.out.print("  " + n);
                else
                    System.out.print("   " + n);
            }
            System.out.println();
            rowCount++;
        }
    }

    public static void printPascalTriangle1(int numRows) {
        int i, j, space, num;
        for (i = 0; i < numRows; i++) {
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void printPascalTriangle2(int numRows) {
        int i, j, space, num;
        for (i = 0; i < numRows; i++) {
            for (space = numRows; space > i; space--) {
                System.out.print("   ");
            }
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + "    ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}


