package com.company;

import java.util.Scanner;

public class binarrysearcgh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();


        }
        int e=sc.nextInt();

        int low=0;
        int high=arr.length-1;
        int mid=0;
        boolean flag=false;
        while(high >=low){
            mid=low+(high-low)/2;
            if(arr[mid]==e){
                flag=true;
                break;
            }
            else if(arr[low]<=arr[mid]){
                if(e>=arr[low]&& e<=arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            else {
                if (e >= arr[mid] && e <= arr[high]) {

                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        if(flag){
            System.out.println(mid);
        }
        else{
            System.out.println("-1");
        }

    }
}
