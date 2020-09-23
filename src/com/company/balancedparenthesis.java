package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


public class balancedparenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (isbalanced(s)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isbalanced(String exp) {
        boolean flag = true;
        int count = 0;

        // Traversing the expression
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(') {
                count++;
            } else {

                // It is a closing parenthesis
                count--;
            }
            if (count < 0) {

                // This means there are
                // more Closing parenthesis
                // than opening ones
                flag = false;
                break;
            }

//        Deque<Character> stack = new ArrayDeque<>();
//        for (int i = 0; i < expr.length(); i++) {
//            char x = expr.charAt(i);
//
//            if (x == '(' || x == '[' || x == '{') {
//                stack.push(x);
//                continue;
//            }
//
//
//            if (stack.isEmpty())
//                return false;
//
//            switch (x) {
//                case ')':
//                    stack.pop();
//                    if (x == '{' || x == '[')
//                        return false;
//                    break;
//
//                case '}':
//                    stack.pop();
//                    if (x == '(' || x == '[')
//                        return false;
//                    break;
//
//                case ']':
//                    stack.pop();
//                    if (x == '(' || x == '{')
//                        return false;
//                    break;
//            }
//        }
//
//        return (stack.isEmpty());
        }
        if (count != 0)
        {
            flag = false;
        }
        return flag;

    }

}
