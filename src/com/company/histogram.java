package com.company;

import java.util.*;

public class histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=sc.nextInt();
        }
        Stack<Integer>stack=new Stack<>();
        int i=0;
        int max=0;
        int area;
        int top;
        while(i<n){
            if(stack.isEmpty() || arr[stack.peek()]<=arr[i]){
                stack.push(i++);
            }
            else{
                top=stack.peek();
                stack.pop();
                if(stack.isEmpty()){
                    area=arr[top]*i;
                }
                else{
                    area= arr[top] * (i-stack.peek() - 1);
                }
                if(area>max){
                    max=area;
                }


            }
        }
        while(!stack.isEmpty()){
            top=stack.peek();
            stack.pop();
            if(stack.isEmpty()){
                area=arr[top]*i;
            }
            else{
                area= arr[top] * (i - stack.peek() - 1);
            }
            if(area>max){
                max=area;
            }



        }System.out.println(max);


    }
}
