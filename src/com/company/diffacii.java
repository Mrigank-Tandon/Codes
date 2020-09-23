package com.company;

import java.util.Scanner;

public class diffacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] c =s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
           int r=(int)c[i]-(int)c[i+1];
            System.out.print(r);

        }


    }
}
