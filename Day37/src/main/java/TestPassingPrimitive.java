package main.java;

/**
 * Passing Primitive-type Argument into Method - Pass-by-Value.
 */

public class TestPassingPrimitive {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("In caller, before calling the method, the value is: " + number);
        aMethodWithPrimitive(number);
        System.out.println("In caller, after calling the method, the value is: " + number);
    }

    public static void aMethodWithPrimitive(int number) {
        System.out.println("Inside method, before operation, the value is " + number);
        ++number;
        System.out.println("Inside method, after operation, the value is " + number);
    }
}
