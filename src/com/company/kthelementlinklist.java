package com.company;
import java.util.Scanner;

public class kthelementlinklist {
    static Node head;
    static Node tail;
    int size=0;
    public void insertfirst(int element){

        Node node = new Node(element);
        node.next= head;
        head = node;

        if(tail==null){
            tail=head;
        }

        size++;
    }
    public void insertlast(int element){

        if(size==0){
            insertfirst(element);
            return;
        }

        Node node = new Node(element);

        tail.next = node;

        tail = node;

        size++;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kthelementlinklist list1 = new kthelementlinklist();
        while(true) {
            int o = sc.nextInt();
            if (o == -1) {
               break;
            }
            list1.insertlast(o);
        }
        int k=sc.nextInt();
        System.out.println(kthfromlast(k));

    }


    public static int kthfromlast(int k){

        Node slow = head;
        Node fast = head;


        for (int i = 0; i <k; i++) {
            fast = fast.next;
        }

        while(fast!=null){

            slow = slow.next;
            fast = fast.next;
        }

        assert slow != null;
        return slow.value;
    }
    public static class Node{

        int value ;
        Node next;

        public Node(int value) {

            this.value = value;
        }
    }

}
