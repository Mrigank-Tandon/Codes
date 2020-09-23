package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class circularlinklist {

       static Node head,tail;
    public static class Node
    {
        int value;
       Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
    }

        void detectAndRemoveLoop(Node node)
        {
            Node slow = node, fast = node;
            while (slow != null && fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;


                if (slow == fast) {
                    removeLoop(slow, node);
                    return;
                }
            }
        }


        void removeLoop(Node loop, Node curr)
        {
            Node ptr1, ptr2;

            ptr1 = curr;

            while (true) {

                ptr2 = loop;

                while (ptr2.next != loop && ptr2.next != ptr1) {

                    ptr2 = ptr2.next;

                }

                if (ptr2.next == ptr1) {
                    break;
                }

                ptr1 = ptr1.next;
            }


            ptr2.next = null;

        }


    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    public void insert(int element){
      Node node = new Node(element);
        if(head==null){
            head=tail=node;
            return;
        }
        tail.next=node;
        tail=node;
    }


        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            circularlinklist l1=new circularlinklist();
            while(true) {
                int o = sc.nextInt();
                if (o == -1) {
                    break;
                }
                l1.insert(o);
            }
            l1.detectAndRemoveLoop(head);
            l1.printList(head);


        }
    }


