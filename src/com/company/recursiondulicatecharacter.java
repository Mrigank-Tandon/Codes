package com.company;

import java.util.Scanner;

public class recursiondulicatecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unprocessed=sc.next();
        String processed="";
        dup(processed,unprocessed);



    }

    private static void dup(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);


    }



}
