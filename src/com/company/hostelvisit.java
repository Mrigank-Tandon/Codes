package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class hostelvisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        k=k-1;
        while(n-->0){
            int i=sc.nextInt();
            ArrayList<Integer>list=new ArrayList<>();
            if(i==1){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int ans = (int) (Math.pow(a,2)+Math.pow(b,2));
                list.add(ans);



            }
            else if(i==2){
                Collections.sort(list);
                System.out.println(list.get(k));
            }

        }
    }
}
