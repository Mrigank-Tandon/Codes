package com.company;

import java.util.Scanner;

public class ispalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = 0, j = str.length() - 1;


        while (i < j) {


            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("false");
                System.exit(0);
            }


            i++;
            j--;
        }

        System.out.println("true");

    }
}

