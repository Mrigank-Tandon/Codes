package com.company;

import java.util.Scanner;

public class puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                String n=sc.next();
               if(n.equals("?")){
                   arr[i][j]=-1;
               }
               else{
                   arr[i][j]=Integer.parseInt(n);
               }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5; j++) {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=(arr[i][1]*arr[i][0])*2+arr[i][1];
                }
                else{
                    arr[i][j]=arr[i][j];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
