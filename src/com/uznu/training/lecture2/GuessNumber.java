package com.uznu.training.lecture2;


import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        int c;


        c = (a + b) / 2;
        while (true) {
            System.out.println(c);
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (answer.equals("Більше")) {
                c = c / 2 + c;
            } else if (answer.equals("Менше")) {
                c = c / 2 ;
            } else if (answer.equals("Ви вгадали")) {
                break;
            }

        }



    }

}
