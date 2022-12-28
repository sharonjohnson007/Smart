package main.java;

/**
 * To print patterns using nested loops with methods.
 */
public class PrintPatterns {
    public static void main(String[] args) {
        printPatternA(7);
        printPatternB(7);
        printPatternC(7);
        printPatternD(8);
        printPatternE(8);
        printPatternF(8);
        printPatternG(8);
        printPatternH(8);
        printPatternI(8);
        printPatternJ(8);
        printPatternK(8);
        printPatternL(8);
    }

    public static void printPatternA(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("(a)------------------");
    }

    public static void printPatternB(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("(b)------------------");
    }

    public static void printPatternC(int size) {
        for (int row = 1; row < size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int col = 2; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
        System.out.println("(c)------------------");
    }

    public static void printPatternD(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print(col + " ");
                }
            }
            System.out.println();
        }
        System.out.println("(d)------------------");
    }

    public static void printPatternE(int size) {
        for (int row = 1; row <= size; row++) {
            int count = 1;
            for (int k = 1; k <= row - 1; k++) {
                System.out.print("  ");
            }
            for (int col = row; col <= size; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println("");
        }
        System.out.println("(e)------------------");
    }

    public static void printPatternF(int size) {
        for (int row = 1; row <= size; row++) {
            for (int space = size - 1; space >= row; space--) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
        System.out.println("(f)------------------");
    }

    public static void printPatternG(int size) {
        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println("");
        }
        System.out.println("(g)------------------");
    }

    public static void printPatternH(int size) {
        for (int row = 1; row <= size; row++) {
            for (int space = size - 1; space >= row; space--) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            for (int col = row - 1; col >= 1; col--) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println("(h)------------------");
    }

    public static void printPatternI(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                if (col <= size && col >= row) {
                    System.out.print((col - row + 1));
                } else if (col > size && col < 2 * size - row + 1) {
                    System.out.print(size - (col + row - 1) % size);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("(i)------------------");
    }

    public static void printPatternJ(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= 2 * size; col++) {
                if (col % (size + 1) == 0) {
                    continue;
                } else if ((col <= size) && (col > row)) {
                    System.out.print(" ");
                } else if ((col > size + 1) && (col < 2 * size - row + 1)) {
                    System.out.print(" ");
                } else if (col <= size) {
                    System.out.print(col % (size + 1));
                } else {
                    System.out.print(2 * size - col + 1);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("(j)------------------");
    }

    public static void printPatternK(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i * 2; j < size * 2 - 1; j++) {
                System.out.print("  ");
            }
            for (int l = i; l >= 1; l--) {
                if (l != size)
                    System.out.print(l + " ");
            }
            System.out.println();
        }
        System.out.println("(k)------------------");
    }

    public static void printPatternL(int size) {
        int k = 0, count = 0, count1 = 0;
        for (int i = 1; i <= size; ++i) {
            for (int space = 1; space <= size - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while (k != 2 * i - 1) {
                if (count <= size - 1) {
                    int value = (i + k);
                    if (value > 9) {
                        value = value % 10;
                    }
                    System.out.print(value + " ");
                    ++count;
                } else {
                    ++count1;
                    int values = (i + k - 2 * count1);
                    if (values > 9) {
                        values = values % 10;
                    }
                    System.out.print(values + " ");
                }
                ++k;
            }
            count1 = count = k = 0;
            System.out.println();
        }
        System.out.println("(l)------------------");
    }
}









