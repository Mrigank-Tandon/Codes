package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class frominorderpreorder {
    Node root;
    static Scanner scn = new Scanner(System.in);
    class Node {

        int value;
        Node left;
        Node right;


        public Node(int value) {
            this.value = value;

        }
    }

    public void insert(int value){

        this.root = insert(root, value);
    }
    public int find(int[] in, int ele){


        for (int i = 0; i <in.length ; i++) {

            if(ele==in[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] pre = takeInput();
        int[] in = takeInput();
        frominorderpreorder bt = new frominorderpreorder();
        bt.makefromprein(pre,in);
        bt.display();
    }

    public static int[] takeInput() {
        int n = scn.nextInt();

        int[] rv = new int[n];
        for (int i = 0; i < rv.length; i++) {
            rv[i] = scn.nextInt();
        }

        return rv;
    }
    public void display() {
        this.display(this.root);
    }
    private void display(Node node) {
        if (node == null) {
            return;
        }

        String str = "";

        if (node.left != null) {
            str += node.left.value;
        } else {
            str += "END";
        }

        str += " => " + node.value + " <= ";

        if (node.right != null) {
            str += node.right.value;
        } else {
            str += "END";
        }

        System.out.println(str);

        this.display(node.left);
        this.display(node.right);
    }


    private Node insert(Node node, int value) {

        if(node == null){
            return new Node(value);
        }

        if(node.value>value){
            node.left =insert(node.left, value);
        }

        else{
            node.right= insert(node.right, value);

        }



        return node;
    }
    public void makefromprein(int[] pre, int[] in){

        this.root = makefromprein(root, pre, in);
    }
    private Node makefromprein(Node node, int[] pre, int[] in) {
//
        if(pre.length==0){
            return null;
        }

        int ele = pre[0];

        int index = find(in, ele);


        int[] pre_left= Arrays.copyOfRange(pre,1, index+1);
        int[] pre_right = Arrays.copyOfRange(pre, index+1, pre.length);

        int[] in_left= Arrays.copyOfRange(in,0,index);
        int[] in_right= Arrays.copyOfRange(in,index+1,in.length);

        Node node1 = new Node(ele);

        node1.left =makefromprein(node1.left,pre_left,in_left);
        node1.right = makefromprein(node1.right,pre_right,in_right);

        return node1;
    }


}
