package com.company;


import java.util.Scanner;

public class optimalgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            System.out.println(optimalStrategyOfGame(arr, n));
        }

    }
    static int optimalStrategyOfGame(
            int arr[], int n)
    {

        int table[][] = new int[n][n];
        int gap, i, j, x, y, z;


        for (gap = 0; gap < n; ++gap) {
            for (i = 0, j = gap; j < n; ++i, ++j) {

                x = ((i + 2) <= j)
                        ? table[i + 2][j]
                        : 0;
                y = ((i + 1) <= (j - 1))
                        ? table[i + 1][j - 1]
                        : 0;
                z = (i <= (j - 2))
                        ? table[i][j - 2]
                        : 0;

                table[i][j] = Math.max(
                        arr[i] + Math.min(x, y),
                        arr[j] + Math.min(y, z));
            }
        }

        return table[0][n - 1];
    }
}
