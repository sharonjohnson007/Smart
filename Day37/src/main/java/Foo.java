package main.java;

/**
 * Example for Instantiation process.
 */

class Foo {
    public static void main(String[] args) {
        Foo f1 = new Foo();
        System.out.println("number1 is " + f1.number1 + ", number2 is " + f1.number2);
        Foo f2 = new Foo(55, 66);
        System.out.println("number1 is " + f2.number1 + ", number2 is " + f2.number2);
    }

    public int number1 = 11;

    {
        number1 = 33;
        number2 = 44;
    }

    public int number2 = 22;

    public Foo() {
        System.out.println("running Foo()...");
    }

    public Foo(int number1, int number2) {
        System.out.println("running Foo(int, int)...");
        this.number1 = number1;
        this.number2 = number2;
    }
}



