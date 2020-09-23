package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arrayList=new ArrayList<>();
        ArrayList<Integer>arrayList1=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            arrayList.add(sc.nextInt());
            arrayList1.add(arrayList.get(i));
        }



        Collections.reverse(arrayList);

        if(arrayList.equals(arrayList1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
