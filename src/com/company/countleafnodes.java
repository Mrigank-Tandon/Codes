package com.company;



import java.util.ArrayList;
import java.util.Scanner;

public class countleafnodes {
    Node root;

    public class Node{
        int value;
        ArrayList<Node>children;

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
        countleafnodes tree=new countleafnodes();
        tree.insert(s);
        System.out.println(tree.count());
    }

    public int count() {

        return count(root);

    }

    private int count(Node root) {
        int leaves = 0;
        if(root==null)
        {
            return 0;
        }
        if(root.children.size()==0)
        {
            return 1;
        }

        for(int i = 0; i < root.children.size(); i++)
        {
            leaves += count(root.children.get(i));
        }

        return leaves;


    }
}
