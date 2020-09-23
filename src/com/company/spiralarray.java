package com.company;

import java.util.Scanner;

public class spiralarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j<n ; j++) {
                arr[i][j]=sc.nextInt();

            }

        }
        int start=0;
        int end=n;
        int top=0;
        int bottom=m;

        while(top<bottom && start<end){
            for (int i = start; i <end  ; ++i) {
                System.out.print(arr[top][i]+", ");


            }

            top++;
            for (int i = top; i <bottom ; ++i) {
                System.out.print(arr[i][end-1]+", ");


            }
            end--;
            if(top<bottom) {
                for (int i = end-1; i >= start; --i) {
                    System.out.print(arr[bottom-1][i] + ", ");


                }
                bottom--;
            }
            if(start<end) {
                for (int i = bottom-1; i >= top; --i) {
                    System.out.print(arr[i][start] + ", ");


                }
                start++;
            }
        }
        System.out.print("END");

    }
}
