package com.company;

import java.util.Scanner;

public class issorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int c[] = new int[j];
        for (int i = 0; i < j; i++) {
            c[i] = sc.nextInt();
        }

        for (int i = 0; i < j-1; i++) {

            if (!(c[i + 1] > c[i])) {
                System.out.println("false");

            }

        }System.out.println("true");
    }
}
