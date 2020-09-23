package com.company;
import java.util.*;
public class mappedstring {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String unprocessed = s.next();
        answer(unprocessed,"");
    }

    public static void answer(String unprocessed, String processed) {

        if(unprocessed.length()==0) {
            System.out.println(processed);
            return;
        }

        String s1 = unprocessed.substring(0,1);
        int S1 = Integer.parseInt(s1);
        char ch = (char)('A' + S1-1);

        answer(unprocessed.substring(1),processed+ch);

        if(unprocessed.length()>=2) {
            String s2 = unprocessed.substring(0,2);
            int S2 = Integer.parseInt(s2);
            if(S2<=26) {
                char CH = (char)('A' + S2-1);
                answer(unprocessed.substring(2),processed+CH);
            }
        }
    }
}
