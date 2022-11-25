package main.java;

public class Calculator {
    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return number1 - number2;
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    // Integer divide. Return a truncated int.
    public static int divInt(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return number1 / number2;
    }

    // Real number divide. Return a double.
    public static double divReal(int number1, int number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by 0!");
        }
        return (double) number1 / number2;
    }

    public static void main(String[] args) {
        divInt(34,1);
        System.out.println(divInt(34,34));
        System.out.println(divReal(34,34));
        System.out.println(add(71,29));
        System.out.println(divInt(25,0));
    }
}
