package com.company;

import java.util.Scanner;
import java.util.Stack;

public class kreverselinklist {
    Node tail,head;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }
    public kreverselinklist(){
        this.head=null;
        this.tail=null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kreverselinklist l1=new kreverselinklist();
        int n=sc.nextInt();
        int k=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            l1.insert(sc.nextInt());

        }
        l1.kreverse(k);
        l1.display();
    }

    private void display() {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    public void insert(int ele) {
        Node node=new Node(ele);
        if(head==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;

    }

    public void kreverse(int k){
        Node prev=null;
        Node temp=head;
        Stack<Node>s=new Stack<>();
        while(temp!=null){
            int c=0;
            while(temp!=null && c<k){
                s.push(temp);
                temp=temp.next;
                c++;
            }
            while(!s.isEmpty()){
                if(prev==null) {
                    prev = s.pop();
                    head = prev;
                }
                else{
                    prev.next=s.pop();
                    prev=prev.next;

                }
            }
        }
        prev.next=null;
        tail=prev;

    }
}
