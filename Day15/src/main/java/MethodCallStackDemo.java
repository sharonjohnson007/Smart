package main.java;

public class MethodCallStackDemo {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            System.out.println(1 / 0);
            // A divide-by-0 triggers an ArithmeticException - an unchecked exception
            // This method does not catch ArithmeticException
            // It runs the "finally" and popped off the call stack
        } finally {
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");

        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() {
        System.out.println("Enter methodC()");
        //System.out.println(1 / 0);
        System.out.println("Exit methodC()");
    }


}
