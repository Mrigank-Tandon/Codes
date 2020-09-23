package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class lexographicalorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>arrayList=new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arrayList.add(String.valueOf(i));

        }
        Collections.sort(arrayList);
        arrayList.forEach(integer -> System.out.print(integer+" "));
    }
}
