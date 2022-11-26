package com.bytelegend;



public class Main {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        print(a);
        print(b);
        print(c);

    }

    // Complete this method
    public static void print(int i) {
        System.out.println("Start!");
        System.out.println("Number is: " + i);
        System.out.println("Number+1 is: " + (i + 1));
        System.out.println("Number*10 is: " + (i * 10));
        System.out.println("Number*100 is: " + (i * 100));
        System.out.println("End!");
    }
}
