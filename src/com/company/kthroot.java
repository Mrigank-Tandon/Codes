package com.company;


import java.util.Scanner;

public class kthroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//x^k==n
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble();
            int k = sc.nextInt();
            System.out.println((int)binarysearch(n,k));

        }
    }

    public static double binarysearch(double x, int n)
    {
        double lo = 0.0;
        double hi = x;
        while(hi-lo >= 0)
        {
            double test = lo+(hi-lo)*0.5;
            if (test == lo || test == hi)
            {
                //I couldn't bear to leave this out.  Sometimes there are no
                //double values between lo and hi.  This will be pretty much
                //as close as we can get.  Break here to avoid an infinite loop
                break;
            }
            if ((Math.pow(test,n)) < x)
            {
                lo = test;
            }
            else
            {
                hi = test;
            }
        }
        //cut the final range in half.  It's less than
        //0.0019 in size, so every number in the range, which includes
        //the root, is less than 0.001 away from this
        return lo+(hi-lo)*0.5;
    }
}





