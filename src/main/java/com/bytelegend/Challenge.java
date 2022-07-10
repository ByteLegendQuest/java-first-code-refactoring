package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        System.out.println("Start!");
        System.out.println("Number is: " + a);
        System.out.println("Number+1 is: " + (a + 1));
        System.out.println("Number*10 is: " + (a * 10));
        System.out.println("Number*100 is: " + (a * 100));
        System.out.println("End!");

        System.out.println("Start!");
        System.out.println("Number is: " + b);
        System.out.println("Number+1 is: " + (b + 1));
        System.out.println("Number*10 is: " + (b * 10));
        System.out.println("Number*100 is: " + (b * 100));
        System.out.println("End!");

        System.out.println("Start!");
        System.out.println("Number is: " + c);
        System.out.println("Number+1 is: " + (c + 1));
        System.out.println("Number*10 is: " + (c * 10));
        System.out.println("Number*100 is: " + (c * 100));
        System.out.println("End!");
    }

    // Complete this method
    public static void print(int number) {
        System.out.println("Number is: " + number);
        System.out.println("Number+1 is: " + (number + 1));
        System.out.println("Number*10 is: " + (number * 10));
        System.out.println("Number*100 is: " + (number * 100));
    }
}
