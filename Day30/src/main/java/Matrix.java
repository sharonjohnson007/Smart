package main.java;

/**
 * Matrix operations such as addition, subtraction and multiplication via 2D arrays.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2, 3}, {3, 2, 1}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {1, 2, 3}};
        double[][] c = {{6, 7, 8}, {5, 6, 7}, {4, 5, 6}};
        double[][] d = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        System.out.println("2d-array a[][]");
        print(a);
        System.out.println("Using haveSameDimension(): " + haveSameDimension(a, b));
        System.out.println("Adding using add()");
        add(a, b);
        System.out.println("Using double sub()");
        subtract(c, d);
        System.out.println("Using multiply() ");
        multiply(a, b);
    }

    public static void print(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println(m[i][j] + "  ");
            }
        }
    }

    public static boolean haveSameDimension(int[][] m1, int[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
        }
        return true;
    }  // Used in add(), subtract()

    public static boolean haveSameDimension(double[][] m1, double[][] m2) {
        if (m1.length != m2.length) {
            return false;
        }
        for (int i = 0; i < m1.length; i++) {
            if (m1[i].length != m2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] add(int[][] m1, int[][] m2) {
        int[][] add = new int[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                add[i][j] = m1[i][j] + m2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        return add;
    }


    public static double[][] add(double[][] m1, double[][] m2) {
        double[][] add = new double[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                add[i][j] = m1[i][j] + m2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        return add;
    }

    public static int[][] subtract(int[][] m1, int[][] m2) {
        int[][] sub = new int[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                sub[i][j] = m1[i][j] - m2[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        return sub;
    }

    public static double[][] subtract(double[][] m1, double[][] m2) {
        double[][] sub = new double[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                sub[i][j] = m1[i][j] - m2[i][j];
                System.out.print(sub[i][j] + " ");
            }
            System.out.println();
        }
        return sub;
    }

    public static int[][] multiply(int[][] m1, int[][] m2) {

        int[][] mul = new int[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mul.length; k++) {
                    mul[i][j] += m1[i][k] * m2[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
        return mul;
    }

    public static double[][] multiply(double[][] m1, double[][] m2) {
        double[][] mul = new double[m1.length][m2.length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2.length; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < mul.length; k++) {
                    mul[i][j] += m1[i][k] * m2[k][j];
                }
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
        return mul;
    }
}

