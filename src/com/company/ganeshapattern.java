package com.company;

import java.util.Scanner;

public class ganeshapattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("*");
        for (int i = 1; i <=(n-3)/2 ; i++) {
            System.out.print(" ");

        }
        for (int i = 1; i <=(n+1)/2 ; i++) {
            System.out.print("*");
        }
        System.out.println();


        for (int i = 1; i <=(n-3)/2; i++) {
            System.out.print("*");
            for (int j = 1; j <=(n-3)/2 ; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();

        }
        for (int i = 0; i <n ; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int i = 1; i <=(n-3)/2; i++) {
            for (int j = 1; j <=((n-3)/2)+1 ; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <=(n-3)/2 ; j++) {
                System.out.print(" ");

            }
            System.out.print("*");
            System.out.println();

        }
        for (int i = 1; i <=(n+1)/2 ; i++) {
            System.out.print("*");

        }
        for (int i = 0; i <(n-3)/2 ; i++) {
            System.out.print(" ");

        }
        System.out.print("*");
        System.out.println();


        }
    }

