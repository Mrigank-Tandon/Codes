package com.company;

import java.util.Scanner;

public class countingsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int k=3;
        int []count=new int[k];
        for (int i = 0; i < k; i++) {
            count[i]=0;

        }

        for (int i = 0; i <n ; i++) {
           ++count[arr[i]];
        }
        for (int i = 1; i <=k ; i++) {
            count[i]=count[i]+count[i-1];

        }
        int []b=new int[n];
        if (n >= 0) System.arraycopy(arr, 0, b, 0, n);
        for (int i = n-1; i >=0 ; i--) {
            b[--count[arr[i]]]=arr[i];

        }
        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);

        }

    }
}
