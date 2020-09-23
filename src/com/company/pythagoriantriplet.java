package com.company;

import java.util.Scanner;

public class pythagoriantriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();

            if (n == 1 || n == 2) {
                System.out.println(-1);
            } else if (n % 2 == 0) {
                System.out.println(((n * n) / 4) - 1 + " " + (((n * n) / 4) + 1));
            } else if (n % 2 != 0) {
                System.out.println((n * n - 1) / 2 + " " + (n * n + 1) / 2);

        }
    }
    }

