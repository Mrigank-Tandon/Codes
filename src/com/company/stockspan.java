package com.company;

import java.util.Scanner;
import java.util.Stack;

public class stockspan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        int[] s =new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();

        }
        stack.push(0);
        s[0]=1;
        for (int i = 1; i <n ; i++) {

            while (!stack.empty() && arr[stack.peek()] <= arr[i])
                stack.pop();
            s[i] = (stack.empty()) ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }
        for (int a:s
             ) {
            System.out.print(a+" ");

        }
        System.out.print("END");

    }


}
