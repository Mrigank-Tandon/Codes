package com.company;

import java.util.*;
public class biggestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            Vector<String> arr;
            arr = new Vector<>();
            for (int i = 0; i <n ; i++) {
                arr.add(sc.next());
            }
             printLargest(arr);
        }
    }
    static void printLargest(Vector<String> arr){

        arr.sort((X, Y) -> {


            String XY = X + Y;


            String YX = Y + X;


            return XY.compareTo(YX) > 0 ? -1 : 1;
        });

        for (String s : arr) System.out.print(s);

    }
}
