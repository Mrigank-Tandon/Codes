package com.company;



import java.util.ArrayList;
import java.util.Scanner;

public class depthvaluegeneric {
   Node root;

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
        depthvaluegeneric tree=new depthvaluegeneric();
        tree.insert(s);
        tree.display();

    }
    public void  display() {

        display(root);
    }

    private void display(Node node) {





        for (int i = 0; i <node.children.size() ; i++) {

            display(node.children.get(i));
            System.out.print(i+", ");
        }

        System.out.println();

    }




}
