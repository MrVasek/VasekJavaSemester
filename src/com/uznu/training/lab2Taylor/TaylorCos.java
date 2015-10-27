package com.uznu.training.lab2Taylor;


public class TaylorCos {
    public static void main(String[] args) {
        int i;
        double x = Math.PI / 6;
        double sum1 = 0;
        double sum2 = 0;
        long fact = 1;
        double nominator = 1;
        for (i = 1; i < 20; i++) {
            fact = fact * (2 * i * (2 * i));
            nominator = nominator * x * x;
            if (i % 2 == 0) {
                sum2 = sum2 + nominator / fact;
            } else {
                sum1 = sum1 + nominator / fact;
            }


        }
        double result = 1 + sum1 - sum2;
        System.out.println(result);

    }

}
