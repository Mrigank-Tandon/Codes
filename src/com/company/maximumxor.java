package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class maximumxor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        BigInteger b1 = new BigInteger(a);
        BigInteger b2 = new BigInteger(b);
        System.out.println((b1.xor(b2)).max((b2.xor(b1))));
    }
}
