package main.java;

public class SumOfTheSquares {
    public static void main(String[] args) {
        int num = 0;
        int square;
        int sum = 0;
        while(num <= 100){
            square = (num * num);
            sum = sum + square;
            num++;
        }
        System.out.println(sum);
    }
}
