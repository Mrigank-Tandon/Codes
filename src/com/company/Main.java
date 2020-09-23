package com.company;


    import java.util.*;
    class Main{

        Node tail,head;
        int size = 0;
        public class Node{
            int value;
            Node next;
            public Node(int value){
                this.value=value;
                this.next=null;
            }
        }
        public Main(){
            this.head=null;
            this.tail=null;
        }
        private void display() {
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.value+" ");
                temp=temp.next;
            }
            System.out.println();
        }
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

        public Main merge(Main l1, Main l2){

            Main l3 = new Main();

            Node first = l1.head;
            Node second = l2.head;


            while(first!=null && second!=null){

                if(first.value<second.value){

                    l3.insertlast(first.value);
                    first = first.next;
                }

                else{
                    l3.insertlast(second.value);
                    second = second.next;
                }
            }

            while(first!=null){

                l3.insertlast(first.value);
                first = first.next;
            }

            while (second!=null){

                l3.insertlast(second.value);
                second = second.next;
            }

            return l3;
        }
        public Node mid(){

            Node slow = head;
            Node fast = head;

            while( fast.next!=null && fast.next.next!=null){


                slow= slow.next;
                fast= fast.next.next;


            }
            return slow;
        }


        public Main mergesort(Main list){

            if(list.size==1){
                return list;
            }

            Node mid = list.mid();
            Main first =new Main();

            first.head =list.head;
            first.tail= mid;
            first.size= (list.size+1)/2;

            Main second = new Main();

            second.head= mid.next;
            second.tail = list.tail;
            second.size = list.size/2;

            mid.next =null;

            first = mergesort(first);
            second= mergesort(second);

            return merge(first, second);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0){
                Main l1=new Main();
                Main l2=new Main();
                int n=sc.nextInt();

                for (int i = 0; i <n ; i++) {
                    l1.insertlast(sc.nextInt());

                }
                int l=sc.nextInt();
                for (int i = 0; i <l ; i++) {
                    l2.insertlast(sc.nextInt());

                }
                Main sorted = l1.merge(l1,l2);
                sorted.display();

            }
        }

    }


