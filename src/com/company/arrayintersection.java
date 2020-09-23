package com.company;

import java.util.*;

public class arrayintersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = s.nextInt();
        }
        int[] ar2 = new int[n];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = s.nextInt();
        }
        int fr[] = frequency(ar1);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ar2.length; i++) {
            if (ar2[i] < fr.length && fr[ar2[i]] > 0) {
                list.add(ar2[i]);
                fr[ar2[i]]--;
            }

        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static int[] frequency(int[] ar1) {
        int[] fr = new int[Arrays.stream(ar1).max().getAsInt() + 1];
        // int visited = -1;
        for (int i = 0; i < ar1.length; i++) {
            fr[ar1[i]]++;

        }
        return fr;
        }
    }
