package com.company;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class subsequencerecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();
        while (i-->0) {
            Set<String> a=new HashSet<>();
            String unprocesswd = sc.next();
            String processed = "";
            subsequence(processed,unprocesswd, a);
            System.out.println();
            System.out.println(a.size());
        }
    }

    private static void subsequence(String processed, String unprocesswd, Set<String> a) {
        if(unprocesswd.isEmpty()){
            System.out.print(processed+" ");
            a.add(processed);
            return;
        }
        char ch=unprocesswd.charAt(0);
        unprocesswd=unprocesswd.substring(1);
        subsequence(processed,unprocesswd, a);
        subsequence(processed+ch,unprocesswd, a);




    }
}
