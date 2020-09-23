package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class sumitup {
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int r=sc.nextInt();
        Sumitup(arr,0,r,0,"");
    }

    private static void Sumitup(int[] arr, int i, int r, int sum, String s) {
        if(sum==r){
            if(!set.contains(s)){
                set.add(s);
                System.out.println(s);
            }
            return;
        }
        if(i==arr.length){
            return;
        }
        Sumitup(arr,i+1,r,sum+arr[i],s+arr[i]+" ");
        Sumitup(arr,i+1,r,sum,s);
    }
}
