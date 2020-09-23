package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class increadiblehulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s=sc.next();
            BigInteger biginteger = new BigInteger(s);
            System.out.println(biginteger.bitCount());

        }
    }
}
