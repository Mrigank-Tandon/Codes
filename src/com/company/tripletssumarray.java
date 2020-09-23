package com.company;

import java.util.Arrays;

import java.util.Scanner;




public class tripletssumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();

        }
        int sum = sc.nextInt();
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            int j = i + 1;
            int k = A.length - 1;
            while (j < k) {
                int ta = A[i] + A[j] + A[k];
                if (ta > sum) {
                    k--;
                } else if (ta < sum) {
                    j++;
                } else {
                    System.out.println(A[i] + ", " + A[j] + " and " + A[k]);
                    j++;
                    k--;
                }

            }
        }

    }
}