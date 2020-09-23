package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class playingwithcards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> prime = new Stack<>();
        Stack<Integer> notprime = new Stack<>();
        int n = sc.nextInt();
        int q = sc.nextInt();
        while (q-- > 0) {
            for (int i = 0; i < n; i++) {
                stack.push(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                if (isprime(stack.peek())) {
                    prime.push(stack.peek());
                } else {
                    notprime.push(stack.peek());
                }
                stack.pop();
            }
            while (!notprime.isEmpty()) {
                System.out.println(notprime.pop());
            }
            while (!prime.isEmpty()) {
                System.out.println(prime.pop());
            }
        }
    }

    private static boolean isprime(Integer peek) {
        boolean[] prime =new boolean[peek+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for (int i = 2; i*i <prime.length ; i++) {
            if(prime[i]){
                for (int j = 2; j*i <=peek ; j++) {
                    prime[j * i]=false;
                }
            }
        }return prime[peek];
    }
}