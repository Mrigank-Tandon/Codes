package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class stringsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=sc.nextInt();

        String[] array = new String[i];
        for (int j = 0; j < array.length; j++) {
            array[j]=sc.next();
        }
        Arrays.sort(array);
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }

}}
