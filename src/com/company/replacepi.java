package com.company;

import java.util.Scanner;

public class replacepi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(n-- >0){
            String s=sc.next();
            System.out.println(replacePi(s));

        }
    }
    public static String replacePi(String str)
    {

        if (str.length() <= 1) {

            return str;
        }


        if (str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i') {
            return "3.14" + replacePi(str.substring(2, str.length()));
        }


        return str.charAt(0) + replacePi(str.substring(1, str.length()));
    }
}
