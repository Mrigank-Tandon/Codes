package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SudokuSolver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j]=sc.nextInt();
            }

        }


        sudokusolver(grid,0,0);
    }

    public static void sudokusolver(int[][] board, int row ,int col){

        if(row==board.length){

            display(board);
            return;
        }

        if(col == board.length){
            sudokusolver(board,row+1,0);
            return;
        }

        if(board[row][col]==0){

            for (int val = 1; val <=9 ; val++) {

                if(isSafe(board,row,col,val)){

                    board[row][col]= val;
                    sudokusolver(board,row,col+1);
                    board[row][col]=0;
                }
            }
        }

        else{
            sudokusolver(board,row,col+1);
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int val) {

        for (int i = 0; i <board.length ; i++) {

            if(board[i][col]==val){
                return false;
            }
        }

        for (int i = 0; i <board.length ; i++) {

            if(board[row][i]==val){
                return false;
            }
        }

        int rno = row/3;
        int cno = col/3;

        for (int i = 3*rno; i <3*(rno+1) ; i++) {
            for (int j = 3*cno; j <3*(cno+1) ; j++) {

                if(board[i][j]==val){
                    return false;
                }
            }
        }

        return true;
    }

    private static void display(int[][] board) {

        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board.length ; j++) {
                System.out.print(board[i][j]);
            }

            System.out.println();
        }

    }
}