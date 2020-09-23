package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class findgreaterelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[2 * n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        for(int i = 0; i < 2 * n; i++)
            arr[i] = arr[i % n];

         int next;
        for (int i = 0; i <n ; i++) {

            next=-1;
            for (int j = i + 1; j < n*2; j++) {
                if (arr[j] > arr[i]) {
                   next=arr[j];

                    break;
                }

            }




                System.out.print(next+" ");



            }

            }

            }




