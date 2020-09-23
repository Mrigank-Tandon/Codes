package com.company;

import java.util.Scanner;

public class lstindexof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int f=sc.nextInt();
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]==f){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println("-1");

    }
}
