package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class sumnodestree {
    Node root;
    public class Node{
        int value;
        ArrayList<Node>children;

        public Node(int value) {
            this.value = value;
            this.children=new ArrayList<>();
        }
    }
    public void insert( Scanner s){
        int val=s.nextInt();
        this.root=new Node(val);
        insert(root,s);
    }

    private void insert(Node node, Scanner s) {
        int childno = s.nextInt();
        for (int i = 0; i<childno ; i++) {
            int value = s.nextInt();
            Node child=new Node(value);
            node.children.add(child);
            insert(child,s);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        sumnodestree tree=new sumnodestree();
        tree.insert(s);
        System.out.println(tree.sum());
    }

    public int  sum() {

        return sum(root);
    }

    private int sum(Node node) {
        int sum=node.value;
        for (int i = 0; i <node.children.size() ; i++) {
            sum=sum+sum(node.children.get(i));
        }
        return sum;
    }

}
