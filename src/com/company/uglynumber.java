package com.company;

import java.util.Scanner;

public class uglynumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();

            int c=1;
            int i=1;
           while(n>c){
                 i++;

                if (i % 5 == 0 || i % 2 == 0 || i % 3 == 0) {
                         c++;
                }
            }
            System.out.println(i);

        }
    }
    }


