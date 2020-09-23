package com.company;

import java.util.Scanner;
//                      1
//                  2	3	2
//              3	4	5	4	3
//         4	5	6	7	6	5	4
public class patterntriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = n-i; j >1 ; j--) {
                System.out.print(" ");
            }
                for (int k = 0; k <=i; k++) {
                    System.out.print(k+1+" ");

                }
            System.out.println();

            }

        }
    }

