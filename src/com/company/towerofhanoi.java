package com.company;

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        toh(n,"T1","T2","T3");
        System.out.println((int)Math.pow(2,n)-1);
    }
    public static void toh(int n,String src,String dest,String helper){
        if(n==0){
            return ;
        }
        toh(n-1,src,helper,dest);
        System.out.println("Move "+n+"th disc from "+src+" to "+dest);
        toh(n-1,helper,dest,src);

    }

}
