package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class subsetsumtarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int n=sc.nextInt();
            int []arr=new int[n];
            int v=sc.nextInt();
            ArrayList<Integer> set=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();

            }

            subset(arr,0,0,set);

           if(set.contains(v)){
               System.out.println("Yes");
           }
           else{
               System.out.println("No");
           }
        }


    private static void subset(int[] arr, int i, int sum, ArrayList<Integer> set) {
        if(i==arr.length){

            set.add(sum);

            return;
        }
        subset(arr, i+1, sum+ arr[i], set);
        subset(arr, i+1, sum, set);

    }
}
