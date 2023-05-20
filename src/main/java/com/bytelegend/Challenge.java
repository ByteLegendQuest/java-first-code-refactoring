package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        print("Start!");
        print("Number is: " + a);
        print("Number+1 is: " + (a + 1));
        print("Number*10 is: " + (a * 10));
        print("Number*100 is: " + (a * 100));
        print("End!");

        print("Start!");
        print("Number is: " + b);
        print("Number+1 is: " + (b + 1));
        print("Number*10 is: " + (b * 10));
        print("Number*100 is: " + (b * 100));
        print("End!");

        print("Start!");
        print("Number is: " + c);
        print("Number+1 is: " + (c + 1));
        print("Number*10 is: " + (c * 10));
        print("Number*100 is: " + (c * 100));
        print("End!");
    }

    // Complete this method
    public static void print(int number) {
        System.out.print(number);
    }
}
