package com.company;

import java.util.Scanner;

public class arrayrowwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//4
        int n = sc.nextInt();//4
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {

                    System.out.print(a[i][j] + ", ");

                }
            }
            if (i%2 !=0){
                for (int k = n-1; k >= 0; k--) {
                    System.out.print(a[i][k] + ", ");
                }
            }





        }
        System.out.print("END");
    }
}

