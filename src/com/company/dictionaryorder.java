package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dictionaryorder {
    static String temp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList=new ArrayList<String>();
        String unprocessed = sc.next();
        temp=unprocessed;
        String processed="";
        dic(processed,unprocessed,arrayList);
        Collections.sort(arrayList);
        arrayList.forEach(System.out::println);

    }

    private static void dic(String processed, String unprocessed, ArrayList<String> arrayList) {

        if(unprocessed.isEmpty()){
            if(processed.compareTo(temp)<0)
                arrayList.add(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<=processed.length();i++){
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            dic(first+ch+second,unprocessed, arrayList);
        }
    }
}
