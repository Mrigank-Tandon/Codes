package com.company;


import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class reverseusingstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer>stack=new Stack<>();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(sc.nextInt());
        }

        stack.forEach(System.out::println);

    }


}
