package com.company;

import java.util.Scanner;

public class arrayclumnwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();//4
        int n = sc.nextInt();//4
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

            }

        }
        for (int j = 0; j < n; j++) {


                if(j%2==0){
                    for (int i = 0; i < m; i++) {
                        System.out.print(a[i][j] + ", ");
                    }
                }



                if (j % 2 != 0) {
                    for (int i = m-1; i >=0; i--) {

                        System.out.print(a[i][j] + ", ");
                    }

            }
        }


        System.out.print("END");



        }

    }

