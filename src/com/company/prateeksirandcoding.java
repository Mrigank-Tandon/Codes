package com.company;

import java.util.Scanner;
import java.util.Stack;

public class prateeksirandcoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Stack<Integer>stack=new Stack<>();
        while(n-- >0) {
            int c = sc.nextInt();
            switch (c) {
                case 2 :
                    stack.push(sc.nextInt());
                    break;
                case 1 :
                    if(!stack.isEmpty()) {
                        System.out.println(stack.pop());
                    }
                    else{
                        System.out.println("No Code");
                    }
                    break;

            }
        }
    }
}
