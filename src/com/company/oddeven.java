package com.company;

import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-->0){
            int sum=0;
            int sum1=0;
            String s=sc.next();
            char[] ar =s.toCharArray();

            int[] arr =new int[s.length()];
            for (int i = 0; i <s.length() ; i++) {

                arr[i]=Character.getNumericValue(ar[i]);
            }

            for (int value : arr) {
                if (value % 2 == 0) {
                    sum = sum + value;
                } else {
                    sum1 = sum1 + value;
                }
            }

            if(sum1%3==0 || sum%4==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
    }
}
