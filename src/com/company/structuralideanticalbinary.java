package com.company;

import java.util.Scanner;

public class structuralideanticalbinary {
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
    private Node insert(Node node,Scanner s){
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
        Scanner s = new Scanner(System.in);
        structuralideanticalbinary tree=new structuralideanticalbinary();
        structuralideanticalbinary tree2=new structuralideanticalbinary();



        if(identicalTrees(tree.root,tree2.root)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

    }
   static boolean identicalTrees(Node a, Node b)
    {

        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.value == b.value
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));


        return false;
    }

}
