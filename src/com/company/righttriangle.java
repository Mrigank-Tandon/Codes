package com.company;

import java.util.Scanner;

public class righttriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i, j;
        for(i=0; i<n; i++) //outer loop for number of rows(n)
        {
            for(j=2*(n-i); j>=0; j--) // inner loop for spaces
            {
                System.out.print(" "); // printing space
            }
            for(j=0; j<=i; j++) //  inner loop for columns
            {
                System.out.print("* "); // print star
            }
            System.out.println(); // ending line after each row
        }

    }
}
