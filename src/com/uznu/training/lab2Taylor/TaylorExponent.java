package com.uznu.training.lab2Taylor;


public class TaylorExponent {
    public static void main(String[] args) {
        int i;
        double x = 1;
        double result = 1;
        long fact = 1;
        double nominator = 1;
        {
            for (i = 1; i < 20; i++)
            fact = fact * i;
            nominator = nominator * x;
            result = result + nominator / fact;
        }
        System.out.println(result);

    }

}
