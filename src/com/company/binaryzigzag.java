package com.company;

import java.util.Scanner;

public class binaryzigzag {
   Node root;
    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }
    public void insert(Scanner s){
        this.root=insert(root,s);
    }
    private Node insert(Node node, Scanner s){
        if(node==null){
            int val=s.nextInt();
            return new Node(val);

        }
        String dir=s.next();
        if(dir.equals("true")){
            node.left=insert(node.left,s);
        }
        String dir2 = s.next();
        if(dir2.equals("true")){
            node.right=insert(node.right,s);
        }
        return node;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        binaryzigzag tree=new binaryzigzag();
        tree.insert(s);
        tree.display();
    }

    private void display() {
        display(root);

    }

    private void display(Node node) {
        if(node == null){
            return;
        }

        System.out.println(node.value);

        display(node.left);
        display(node.right);
    }
    }



