package com.company;

import java.util.Scanner;

public class findupperlowerbound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        while(t-- >0){
            int v=sc.nextInt();
            int l=0;
            int k=0;
            for (int i = 0; i <n ; i++) {
                if(arr[i]==v){
                    System.out.print(i+" ");
                    l=1;
                    break;
                }


            }
            for (int j = n-1; j >=0 ; j--) {
                if (arr[j] == v) {
                    System.out.print(j);
                    k = 1;
                    break;
                }
            }
                if(k!=1 && l!=1){

                    System.out.println("-1"+" "+"-1");

            }
            System.out.println();
        }
    }
}
