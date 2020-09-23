package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class stucturalidentical {
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
        stucturalidentical tree=new stucturalidentical();
        stucturalidentical tree1=new stucturalidentical();
        tree.insert(s);
        tree1.insert(s);
        if(identical(tree.root,tree1.root)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }

    private static boolean identical(Node a,Node b) {
        if(a==null && b==null){
            return true;
        }

        assert a != null;
        if(a.value==b.value){

                for (int i = 0; i < a.children.size(); i++) {
                    identical(a.children.get(i),b.children.get(i));
                }


        }else{return false;}
        return true;
    }


}

