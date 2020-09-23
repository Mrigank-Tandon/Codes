package com.company;

import java.util.Scanner;

public class modularexpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        System.out.println(module(a,b,c));


    }
    public static long module(long  a,long  b,long c)
    {
        if(b==0)
            return 1;
        return ((a%c)*((module(a,b-1,c))%c))%c;
    }
}
