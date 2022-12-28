package main.java;

import java.util.Scanner;

/**
 * To list all the factorials that can be expressed as an int.
 * (i.e., 32-bit signed integer in the range of [-2147483648, 2147483647])
 */

public class FactorialInt {
    public static void main(String[] args) {
        int sum=1,n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        n= sc.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum*i;
            if(i>12){
                System.out.println("The factorial of 13 is out of range");
                break;
            }
            System.out.println("The factorial of "+i+" is "+sum);
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
    }
}
