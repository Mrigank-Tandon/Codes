package com.company;

import java.util.Scanner;

public class manmohan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                if(i%2==0){
                    if((j==1)||j==(i) )
                        System.out.print("1");


                    else
                        System.out.print("0");

                }



                if(i%2!=0){
                    System.out.print("1");
                }

            }
            System.out.println();

        }
    }
}
