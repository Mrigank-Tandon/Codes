package com.company;

import java.util.Scanner;

public class ratmazealldirec {
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        char [][]maze=new char[n][m];


        for (int i = 0; i <n ; i++) {
            String s=sc.next();
            char[]c=s.toCharArray();


            System.arraycopy(c, 0, maze[i], 0, c.length);
        } solveMaze(maze);
    }


    static boolean solveMaze(char[][] maze)
    {
        int [][]path = new int[n][m];


        if (ratmaze(maze, 0, 0, path,"down")) {
            display(path);
            return true;

        }
        System.out.print("-1");
        return false;

    }

    static boolean ratmaze(char[][] maze, int row, int col, int[][] path, String s) {
        if(n-1==row && m-1==col && maze[row][col]=='O'){
            path[row][col]=1;
            return true;
        }


        if(isSafe(maze, row, col)){
            path[row][col]=1;


                if(!s.equals("up") &&ratmaze(maze,row+1,col,path, "down")){
                    return true;
                }

              if(!s.equals("left") &&ratmaze(maze, row, col+1, path, "right"))
                  return true;

                if(!s.equals("down") &&ratmaze(maze,row-1,col,path, "up")){
                    return true;
                }

            if(!s.equals("right") &&ratmaze(maze, row, col-1, path, "left"))
                return true;
            path[row][col]=0;
            return false;

        }
        return false;
    }

    static boolean isSafe(char[][] maze, int row, int col) {
        return (row>=0 && row<n && col>=0 && col<m && maze[row][col]=='O');
    }

    static void display(int[][]path) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(path[i][j]+" ");
            }

            System.out.println();
        }
    }
}
