package com.company;

import java.util.Scanner;

public class nqueensadvance {
    static int c=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        boolean[][] board = new boolean[n][n];
        nqueen(board, 0);
        System.out.println();
        System.out.println(c);
    }

    public static void nqueen(boolean[][] board, int row){

        if(row == board.length){
            printmatrix(board);
            c++;
            return;
        }

        for (int col = 0; col <board.length ; col++) {

            if(isSafe(board, row, col)){

                board[row][col]=true;
                nqueen(board, row+1);
                board[row][col]= false;

            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        for (int i = 0; i <row ; i++) {

            if(board[i][col]){
                return false;
            }
        }

        int left = Math.min(row,col);

        for (int i = 1; i <= left ; i++) {

            if(board[row-i][col-i]){
                return false;
            }
        }

        int right = Math.min(row,board.length-col-1);

        for (int i = 0; i <=right  ; i++) {

            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void printmatrix(boolean[][] board) {

        for (int i = 0; i <board.length ; i++) {

            for (int j = 0; j <board[i].length ; j++) {

                if(board[i][j]){
                    System.out.print("{"+(i+1)+"-"+(j+1)+"}"+" ");
                }

            }

        }
        System.out.print(" ");

    }
}
