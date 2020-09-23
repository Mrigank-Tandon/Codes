package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class appendkelements {
    Node head,tail;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public appendkelements(){
        this.head=null;
        this.tail=null;

    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }
    public void insert(int ele){
        Node node =new Node(ele);
        if(head==null){
            head=tail=node;
        }
        tail.next=node;
        tail=node;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        appendkelements l1=new appendkelements();
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            l1.insert(sc.nextInt());

        }
        int k=sc.nextInt();
       int i=n-k;
        l1.kappend(i);

    }




    private void kappend(int i) {

        Node odd_head = null;
        Node odd_tail = null;

        Node even_head = null;
        Node even_tail= null;

        Node temp = head;
        int c=0;

        while(temp!=null){

            if(c<i){

                if(odd_head==null){

                    odd_head= temp;
                    odd_tail=temp;
                }
                else{
                    odd_tail.next=temp;
                    odd_tail=temp;
                }
                c++;
            }

            else{

                if(even_head==null){

                    even_head= temp;
                    even_tail=temp;
                }
                else{
                    even_tail.next=temp;
                    even_tail=temp;
                }
            }

            temp = temp.next;

        }

        even_tail.next =odd_head;
        head = even_head;

        odd_tail.next =null;
        tail =odd_tail;

    }
}
