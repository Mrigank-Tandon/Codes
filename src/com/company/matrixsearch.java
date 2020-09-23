package com.company;

import java.util.Scanner;

public class matrixsearch {
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
        int e=sc.nextInt();
        int i=0;
        int j= a.length-1;
        while(i<a.length && j>=0){

            if(a[i][j]==e){
                System.out.println("1");
                System.exit(0);

            }
            else if(a[i][j]<e){

                i++;
            }
            else{
                j--;
            }
        }
        System.out.println("0");




    }
}
