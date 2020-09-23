package com.company;

import java.util.Scanner;

public class dulplicatecharacterformat {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(replacePi(s));



}

    public static String replacePi(String str)
    {

        if (str.length() <= 1) {

            return str;
        }


        if (str.charAt(0) ==    str.charAt(1) ) {
            return str.charAt(0)+"*" + replacePi(str.substring(1, str.length()));
        }


        return str.charAt(0) + replacePi(str.substring(1, str.length()));
    }
}
