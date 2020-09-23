package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class sumatkgenerictree {
    Node root;
    static int k;

    public class Node{
        int value;
        ArrayList<Node> children;

        public Node(int value) {
            this.value = value;
            this.children=new ArrayList<>();
        }
    }
    public void insert(Scanner s){
        int value=s.nextInt();
        this.root= new Node(value);
        insert(root,s);
    }

    private void insert(Node node, Scanner s) {
        int childno = s.nextInt();
        for (int i = 0; i < childno; i++) {
            int value = s.nextInt();
            Node child=new Node(value);
            node.children.add(child);
            insert(child,s);


        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sumatkgenerictree tree=new sumatkgenerictree();
        tree.insert(s);
         k=s.nextInt();
         int ans=tree.sumatk(k);
        System.out.println(ans);




    }
    public  int sumatk(int k){

        return atLevel(root, k);
    }

    private  int atLevel(Node node, int k) {

        if(k==0){

            return node.value;
        }
        int sum=0;

        for (int i = 0; i <node.children.size() ; i++) {

            sum+=atLevel(node.children.get(i),k-1);
        }
        return sum;
    }


}
