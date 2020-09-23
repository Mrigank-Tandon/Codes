package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        String unprocessed=sc.next();
        String processed="";
        num(processed,unprocessed,list);
        System.out.println();
        System.out.print(list.size());

    }

    private static void num(String processed, String unprocessed, ArrayList<String> list) {
        if(unprocessed.isEmpty()){
            System.out.print(processed+" ");
            list.add(processed);
            return;
        }
        int digit=unprocessed.charAt(0)-'0';
        unprocessed=unprocessed.substring(1);
        for (int i =3*(digit-1) ; i <(3*digit) ; i++) {
            if(i==26){
                continue;

            }
            num(processed+(char)(i+'a'),unprocessed, list);


        }

    }
}
