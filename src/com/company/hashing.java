package com.company;

import java.util.*;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();

        }


        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (count.containsKey(i)) {
                count.put(i, count.get(i) + 1);
            } else {
                count.put(i, 1);
            }


        }
        int c = Collections.max(count.values());
        for (Map.Entry mapElement : count.entrySet()) {
            int key = (int) mapElement.getKey();

            // Add some bonus marks
            // to all the students and print it
            int value = (int)mapElement.getValue() ;
            if(value==c){
                System.out.println(key );
                System.exit(0);
            }


        }
    }
}

