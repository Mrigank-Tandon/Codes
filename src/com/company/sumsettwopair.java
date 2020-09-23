package com.company;
import java.util.*;
public class sumsettwopair {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int target = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = s.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j <n; j++) {
                if((ar1[i]+ar1[j])==target){
                    System.out.println("Yes");
                    System.exit(0);
                }

            }

        }

            System.out.println("No");


    }
}
