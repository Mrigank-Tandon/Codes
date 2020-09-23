package com.company;

import java.util.Scanner;

public class moveallx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char ch[]=s.toCharArray();
        StringBuilder v= new StringBuilder();
        StringBuilder c= new StringBuilder();
        for (char i:ch
             ) {
            if(i=='x'){
                v.append("x");
            }
            else{
                c.append(i);
            }

        }
        System.out.println(c.append(v));
    }
}

