package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class simplehcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int isc = sc.nextInt();
        String a1 = String.valueOf(sc.nextInt());
        String a2 = String.valueOf(sc.nextInt());
        String a3 = String.valueOf(sc.nextInt());
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(a2);
        BigInteger c = new BigInteger(a3);
        System.out.println(c.gcd(a.gcd(b)));

    }
}
