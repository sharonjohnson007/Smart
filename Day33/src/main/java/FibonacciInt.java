package main.java;

import java.util.Scanner;

/**
 * To list all the Fibonacci numbers that can be expressed as an int.
 * (i.e., 32-bit signed integer in the range of [-2147483648, 2147483647])
 */

public class FibonacciInt {
    public static void main(String[] args) {
        int n,f=1,s=1,temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if(i>45){
                System.out.println("F(46) is out of the range of int");
                break;
            }
            System.out.println("f"+"("+i+") = "+f);
            temp=f+s;
            f=s;
            s=temp;
        }
        System.out.println("Value using Integer.MAX_VALUE: "+Integer.MAX_VALUE);
        System.out.println("Value using Integer.MIN_VALUE: "+Integer.MIN_VALUE);
        System.out.println("Value using Integer.MAX_VALUE+1: "+Integer.MAX_VALUE + 1);
    }
}
