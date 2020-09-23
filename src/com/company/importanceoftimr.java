package com.company;
import java.util.*;
public class importanceoftimr {
    static int t=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       ArrayList<Integer>callingorder=new ArrayList<>();
        ArrayList<Integer>idealorder=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            callingorder.add(sc.nextInt());
        }
        for (int i = 0; i <callingorder.size() ; i++) {
            idealorder.add(sc.nextInt());
        }
        System.out.println(callingorder);
        System.out.println(idealorder);
int i=0;
        while(i <callingorder.size()  ) {

            if (callingorder.get(i).equals(idealorder.get(i))) {
                t++;
                callingorder.remove(0);
                idealorder.remove(0);





            } else {

                callingorder=rotateright(callingorder);


                System.out.println(callingorder);
                System.out.println(idealorder);
                i=0;



            }

        }
        System.out.println(t);

    }

    private static ArrayList<Integer> rotateright(ArrayList<Integer> callingorder) {
        int temp=callingorder.get(0);
        for (int i = 1; i <callingorder.size() ; i++) {
            callingorder.set(i-1,callingorder.get(i));

        }

        callingorder.set(callingorder.size()-1,temp);
        t++;
        return callingorder;
    }
}
