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
    public static void print(int number) {
        print("Start!");
        print("Number is: " + number);
        print("Number+1 is: " + (number + 1));
        print("Number*10 is: " + (number * 10));
        print("Number*100 is: " + (number * 100));
        print("End!");
    }
    public static void print(int s) {
        System.put.println(s);
    }
}
