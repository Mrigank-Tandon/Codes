package com.company;

import java.util.*;

public class subsetsum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int []arr=new int[n];
            ArrayList<Integer>set=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                arr[i]=sc.nextInt();

            }

            subset(arr,0,0,set);
            int count=0;
            for (int i:set
                 ) {
                if(i==0){
                    count++;
                }

            }
            System.out.println(set.size());
            if(count>=2 ){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
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
