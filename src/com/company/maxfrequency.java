package com.company;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] arr =s.toCharArray();
        HashMap<Character, Integer> count= new HashMap<>();
        for(char i: arr)
        {
            if(count.containsKey(i)){
                count.put(i,count.get(i)+1);
            }
            else{
                count.put(i,1);
            }


        }
        int maxValueInMap=(Collections.max(count.values()));  // This will return max value in the Hashmap
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }


    }
}
