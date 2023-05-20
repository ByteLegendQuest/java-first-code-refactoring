package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        println("Start!");
        println("Number is: " + a);
        println("Number+1 is: " + (a + 1));
        println("Number*10 is: " + (a * 10));
        println("Number*100 is: " + (a * 100));
        println("End!");

        println("Start!");
        println("Number is: " + b);
        println("Number+1 is: " + (b + 1));
        println("Number*10 is: " + (b * 10));
        println("Number*100 is: " + (b * 100));
        println("End!");

        println("Start!");
        println("Number is: " + c);
        println("Number+1 is: " + (c + 1));
        println("Number*10 is: " + (c * 10));
        println("Number*100 is: " + (c * 100));
        println("End!");
    }

    // Complete this method
    public static void print(int number) {
        System.out.println(number);
    }
}
