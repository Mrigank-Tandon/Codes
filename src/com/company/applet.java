package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class applet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = s.nextInt();
        }
        int target = s.nextInt();
        TargetPair(ar1, target);
    }

    public static void   TargetPair(int[] ar, int target) {
        Arrays.sort(ar);
        int start = 0;
        int end = ar.length - 1;
        while (start < end) {
            if (ar[start] + ar[end] == target) {
                System.out.println(ar[start] + " and " + ar[end]);
                start++;
                end--;
            } else if (ar[start] + ar[end] > target) {
                end--;
            } else
                start++;
        }


    }
}