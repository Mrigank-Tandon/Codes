package com.company;

import java.util.Scanner;

public class allindiccesproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        int m=sc.nextInt();
        for (int i = 0; i <n ; i++) {
           if(arr[i]==m){

               System.out.print(i+" ");
           }

        }
    }
}
