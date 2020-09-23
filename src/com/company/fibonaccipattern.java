package com.company;
import java.util.*;

class fibonaccipattern {

    // function to fill Fibonacci Numbers
    // in f[]
    static void fib(int[] f, int N)
    {
        // 1st and 2nd number of the
        // series are 1 and 1
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= N; i++)

            // Add the previous 2 numbers
            // in the series and store it
            f[i] = f[i - 1] + f[i - 2];
    }

    static void fiboTriangle(int n)
    {
        // Fill Fibonacci numbers in f[] using
        // fib(). We need N = n*(n+1)/2 Fibonacci
        // numbers to make a triangle of height
        // n
        int N = n * (n + 1) / 2;
        int[] f =new int[N + 1];
        fib(f, N);

        // To store next Fibonacci
        // Number to print
        int fiboNum = 1;

        // for loop to keep track of
        // number of lines
        for (int i = 1; i <= n; i++)

        {
            if(i==1){
                System.out.print("0");
            }
            else {
                // For loop to keep track of
                // numbers in each line
                for (int j = 1; j <= i; j++)
                    System.out.print(f[fiboNum++] + " ");
            }

            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        fiboTriangle(n);
    }
}