package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class playingwithbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
           int a=sc.nextInt();
           int b=sc.nextInt();
           int c=0;
            BigInteger biginteger = new BigInteger(String.valueOf(a));
            BigInteger biginteger1 = new BigInteger(String.valueOf(b));
            for (int i = a; i <=b ; i++) {
                c=c+(BigInteger.valueOf(i).bitCount());

            }

            System.out.println(c);

        }
    }
}
