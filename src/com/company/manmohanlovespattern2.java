package com.company;

import java.util.Scanner;

public class manmohanlovespattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                if(i<3) {

                    System.out.print(1);
                }
                else {
                    if((j==1)||j==(i) )
                        System.out.print(i-1);


                    else
                        System.out.print("0");

                }
            }
            System.out.println();

        }


    }
}
