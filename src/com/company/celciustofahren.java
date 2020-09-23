package com.company;

import java.util.Scanner;

public class celciustofahren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int n=sc.nextInt();
        for (int i = s; i <=e ; i=i+n) {
            int  celsius =(( 5 *(i - 32)) / 9);
            System.out.println(i+" "+celsius);


        }
    }
}