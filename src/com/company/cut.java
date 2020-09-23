package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class cut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());

        }
        int k=sc.nextInt();
        for (int i = k+1; i <n ; i++) {
            System.out.print(linkedList.get(i)+" ");
        }
        for (int i = k; i >=0; i--) {
            System.out.print(linkedList.get(i)+" ");
        }

    }
}
