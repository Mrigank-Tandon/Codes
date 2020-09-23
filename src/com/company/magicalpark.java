package com.company;

import java.util.Scanner;

public class magicalpark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next().charAt(0);

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char ch=arr[i][j];
                if(s<k){
                    System.out.println("No");
                    System.exit(0);
                }
                if(ch=='*'){
                    s+=5;
                }
                else if(ch=='.'){
                    s-=2;
                }
                else{
                    break;
                }
                 if(j!=n-1){
                     s--;
                 }

            }
        }
        System.out.println("Yes");
        System.out.println(s);
    }
}

