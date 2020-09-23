package com.company;

import java.util.Scanner;

public class sortedarrayrecur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       int[] arr =new int[n];


        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();


        }
        System.out.println(arraySortedOrNot(arr,n));

    }

    static boolean arraySortedOrNot(int[] arr, int n)
    {

        // Array has one or no element
        if (n == 0 || n == 1)
            return true;

        for (int i = 1; i < n; i++)

            // Unsorted pair found
            if (arr[i - 1] > arr[i])
                return false;

        // No unsorted pair found
        return true;
    }
}

