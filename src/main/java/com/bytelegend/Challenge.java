package com.bytelegend;

public class Challenge {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static void main(String[] args) {
        print();
    }

    // Complete this method
   private static void print() {
        String valueString = a + String.valueOf(b) + c;
        int value = Integer.parseInt(valueString);
        System.out.println("Start!");
        System.out.println("Number is: " + value );
        System.out.println("Number+1 is: " + (value + 1));
        System.out.println("Number*10 is: " + (value * 10));
        System.out.println("Number*100 is: " + (value * 100));
        System.out.println("End!");
    }
}
