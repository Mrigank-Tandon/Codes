package com.company;

import java.util.Scanner;

public class patternnumberstar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=(n-i)+1 ; j++) {
                System.out.print(j);
            }
            for (int j = 2; j <=(2*i)-2 ; j++) {//odd no
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
