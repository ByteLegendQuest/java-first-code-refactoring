package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        print(a);
        print(b);
        print(c);
    }

    // Complete this method
    public static void print(int a) {
        System.out.println("Start!");
        System.out.println("Number is: " + a);
        System.out.println("Number+1 is: " + (a + 1));
        System.out.println("Number*10 is: " + (a * 10));
        System.out.println("Number*100 is: " + (a * 100));
        System.out.println("End!");
    }
}
