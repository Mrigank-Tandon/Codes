package com.company;

import java.util.Scanner;

public class buildbst {
   static Node root;
    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

    public void display(){
        display(root);
    }

    private void display(Node node) {
        if(node ==null){
            return;
        }
        System.out.print(node.value+" ");
        display(node.left);

        display(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        buildbst tree=new buildbst();
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr =new int[n];

            for (int i = 0; i < n; i++) {
               arr[i]=sc.nextInt();
            }
            root=tree.makefromsorted(arr,0,n-1);
            tree.display();
            System.out.println();
        }
    }

    public Node makefromsorted(int[] ar, int low, int high){

        if(low>high){
            return null;
        }

        int mid = (low + high)/2;

        Node node=new Node(ar[mid]);

        node.left=makefromsorted(ar, low, mid-1);
        node.right=makefromsorted(ar, mid+1, high);
        return node;
    }


}
