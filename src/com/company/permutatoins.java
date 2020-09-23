package com.company;

import java.util.Scanner;

public class permutatoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unprocessed=sc.next();
        String processed="";
        permu(processed,unprocessed);



    }

    private static void permu(String processed, String unprocessed) {
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<=processed.length();i++){
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            permu(first+ch+second,unprocessed);
        }

    }

}
