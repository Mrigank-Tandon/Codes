package com.company;

import java.util.*;

public class sanketstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        char c[] = s.toCharArray();

        int v = 0;
        if (c[0] == 'a') {
            for (int i = 0; i < c.length; i++) {


                if (c[i] == 'b' && v < k) {
                    v++;
                    c[i] = 'a';
                }


            }
            int m = 0;
            for (char i : c) {
                if (i == 'a') {
                    m++;
                }
            }
            System.out.println(m);

        }
    }

}
