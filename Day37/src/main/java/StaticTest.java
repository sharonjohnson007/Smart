package main.java;

/**
 * Example class for static variables and method.
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(msgStatic);
        System.out.println("running main()...");
        System.out.println("number is: " + number);
        System.out.println("running main()...");
        System.out.println("in main(): number1 is " + number1 + ", number2 is: " + number2);
    }

    static int number;

    static {
        number = 88;
        System.out.println("running static initializer...");
    }

    private static String msgStatic = "Hello from static";
    private String msgInstance = "Hello from non-static";

    private static int number1 = 11;

    static {
        System.out.println("running static initializer...");
        number1 = 99;
        number2 = 88;
        System.out.println("number1 is " + number1);
    }

    private static int number2 = 22;
}
