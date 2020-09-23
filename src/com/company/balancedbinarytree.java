package com.company;

import java.util.Scanner;

public class balancedbinarytree {
    static Scanner sc= new Scanner(System.in);
    Node root;
    class Node {

        int value;
        Node left;
        Node right;
        private int height;

        public Node(int value) {
            this.value = value;
            this.height =1;
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
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

//    public int height(){
//
//        return height(root);
//    }

    private int height(Node node) {

        if(node == null){
            return 0;
        }

        return node.height;
    }

    public boolean isbalanced(){

        return isbalanced(root);
    }

    private boolean isbalanced(Node node) {

        if(node == null){
            return true;
        }

        int diff = Math.abs(height(node.left)- height(node.right));

        if(diff>1){
            return false;
        }

        boolean left = isbalanced(node.left);
        boolean right = isbalanced(node.right);


        return left && right;

    }
    public static void main(String[] args) {

        balancedbinarytree bt = new balancedbinarytree();
        bt.insert(sc);
        System.out.println(bt.isbalanced());
    }


}
