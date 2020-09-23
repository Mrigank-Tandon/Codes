package com.company;

import java.util.Scanner;

public class helpramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int ricshaw = Math.min(Math.min(n*c1,m)+Math.min((n+m)*c1,m),c3);
            int cab = Math.min(Math.min(n*c1,m)+Math.min((n+m)*c1,m),c3);


        }
    }
}
