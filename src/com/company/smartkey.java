package com.company;
import java.util.*;
public class smartkey {
     static String[] table ={" ",".+@$","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String unprocessed=sc.next();
        String processed="";
        recursive(processed,unprocessed);

    }
    static void recursive(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit=unprocessed.charAt(0)-'0';
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<table.length;i++){
            if(i==digit) {
                char[] cc = table[i].toCharArray();
                for (char l:cc) {
                  recursive(processed+l,unprocessed);

                }
            }

        }
    }
}

