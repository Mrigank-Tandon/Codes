package com.company;

import java.util.Scanner;

public class agrssivecow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int cow = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        int low=0;
        int high=arr.length-1;
        int mid;
        while(low<=high){
            mid=low+(high-low);
            int c=0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]+mid<arr[i+1]){
                    c++;
                }
            }

        }

    }
}
