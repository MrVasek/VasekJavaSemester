package com.uznu.training.lab4;


public class SwapVariables {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        b = b + a;
        a = b - a;
        b = b - a;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
