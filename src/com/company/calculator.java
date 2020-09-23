package com.company;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            char ch=sc.next().charAt(0);
            if(ch=='+'){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a+b);
            } else if(ch=='-'){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a-b);

            }
            else if(ch=='/'){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a/b);

            }
            else if(ch=='*'){
                int a=sc.nextInt();
                int b=sc.nextInt();
                System.out.println(a*b);

            }
            else if(ch=='%'){
                int a=sc.nextInt();
                int b=sc.nextInt();

                System.out.println(a%b);

            }
            else if(ch=='X'||ch=='x'){
                break;
            }


            else {
                System.out.println("Invalid operation. Try again.");

            }
        }while(true);
    }
}
