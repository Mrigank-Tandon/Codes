package com.company;

import java.util.Scanner;

public class itersectionotwolinklist {
    Node head,tail;
    public class Node
    {
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public itersectionotwolinklist(){
        this.head=null;
        this.tail=null;
    }
    public void insert(int element){
        Node node=new Node(element);
        if(head==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
    }
    public static int intersection(itersectionotwolinklist l1, itersectionotwolinklist l2, int d) {
        Node temp1 = l1.head, temp2 = l2.head;
        for (int i = 0; i < d; i++) {
            temp1 = temp1.next;
        }
        int flag=0;
        while(temp1 != null) {
            if(temp1.value == temp2.value) {
                flag=1;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if(flag==1)
            return temp1.value;
        else
            return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
         itersectionotwolinklist l1 = new itersectionotwolinklist();
         itersectionotwolinklist l2 = new itersectionotwolinklist();
        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            int e1 = sc.nextInt();
            l1.insert(e1);
        }
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            int e2 = sc.nextInt();
            l2.insert(e2);
        }
        if(n1 > n2) {
            int d = n1 - n2;
            System.out.println(intersection(l1, l2, d));
        }
        else {
            int d = n2 - n1;
            System.out.println(intersection(l2, l1, d));
        }

    }
}

