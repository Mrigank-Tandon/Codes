package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class existornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            ArrayList<Integer>arr=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
              arr.add(sc.nextInt());
            }
            int q=sc.nextInt();
            ArrayList<Integer>arr1=new ArrayList<>();
            for (int i = 0; i <q ; i++) {
                arr1.add(sc.nextInt());
            }
           for(int i:arr1){
               if(arr.contains(i))
                   System.out.println("Yes");

               else
                   System.out.println("No");

           }

              
            }
        }
    }

