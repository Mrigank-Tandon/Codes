package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class rotateimage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [][]arr=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                arr[i][j]=sc.nextInt();

            }

        }
        for (int j = n-1; j >=0 ; j--) {
            for (int i = 0; i <n ; i++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println();
            
        }
        
        }
    }

