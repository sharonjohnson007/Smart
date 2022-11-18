package main.java;

public class Multiplier {

    public int multiply(int a, int b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Multiplier multiplier= new Multiplier();
       int result= multiplier.multiply(3,5,6);
        System.out.println(result);
        result=multiplier.multiply(20,20);
        System.out.println(result);
        double result1=multiplier.multiply(2.5,2);
        System.out.println(result1);

    }


}
