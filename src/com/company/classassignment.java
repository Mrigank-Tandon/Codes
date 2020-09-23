package com.company;

import java.util.Scanner;

public class classassignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        recur(arr,n,0);
    }

    private static void recur(int[] arr, int n,int i) {
        if(i==n){
            return;
        }
    }
}
