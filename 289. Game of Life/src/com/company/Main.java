package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static void gameOfLife(int[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        int [][]newBoard= new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int liveNeighbours=getLiveNeighbourCount(i,j,board);
                // dead cell
                if(board[i][j]==0){
                    // Reproduction Life
                    if(liveNeighbours==3){
                        newBoard[i][j]=1;
                    }
                    else newBoard[i][j]=0;
                }
                // live cell
                else{
                    // Under-Population Death
                    if(liveNeighbours<2) newBoard[i][j]=0;
                    // Continue life
                    else if(liveNeighbours==2 || liveNeighbours==3) newBoard[i][j]=1;
                    // Over-Population Death
                    else newBoard[i][j]=0;
                }

            }

        }
        // refilling the values to the old matrix
        for(int i=0;i<rows;i++){
            System.arraycopy(newBoard[i], 0, board[i], 0, cols);
        }
    }
    public static int getLiveNeighbourCount(int i,int j,int[][]board){
        int tag=1;
        int count=0;
        int rows=board.length;
        int cols=board[0].length;
        // left
        if(j-1>=0 && j-1<cols){
            if(board[i][j-1]==tag) count++;
        }

        // right
        if(j+1>=0 && j+1<cols){
            if(board[i][j+1]==tag) count++;
        }

        // up
        if(i-1>=0 && i-1<rows){
            if(board[i-1][j]==tag)count++;
        }
        // down
        if(i+1>=0 && i+1<rows){
            if(board[i+1][j]==tag)count++;
        }
        // up-left
        if(i-1>=0 && j-1>=0 && i-1<rows && j-1<cols){
            if(board[i-1][j-1]==tag)count++;
        }
        // up-right
        if(i-1>=0 && j+1>=0 && i-1<rows && j+1<cols){
            if(board[i-1][j+1]==tag)count++;
        }
        // down-left
        if(i+1>=0 && j-1>=0 && i+1<rows && j-1<cols){
            if(board[i+1][j-1]==tag)count++;
        }
        // down-right
        if(i+1>=0 && j+1>=0 && i+1<rows && j+1<cols){
            if(board[i+1][j+1]==tag)count++;
        }

        return count;
    }

/// No extra space required
//    Original New State
//    0         0   0
//    1         0   1
//    0         1   2
//    1         1   3


    public void gameOfLife1(int[][] board) {
        int rows=board.length;
        int cols=board[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                int liveNeighbours=getLiveNeighbourCount1(i,j,board);
                // dead cell
                if(board[i][j]%2==0){
                    // Reproduction Life
                    if(liveNeighbours==3){
                        board[i][j]=2;
                    }
                    else board[i][j]=0;
                }
                // live cell
                else{
                    // Under-Population Death
                    if(liveNeighbours<2) board[i][j]=1;
                        // Continue life
                    else if(liveNeighbours==2 || liveNeighbours==3) board[i][j]=3;
                        // Over-Population Death
                    else board[i][j]=1;
                }
            }
        }
        // Refilling 1s and 0s
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                if(board[i][j]==2 ||board[i][j]==3) board[i][j]=1;
                else board[i][j]=0;
            }
        }

    }
    public static int getLiveNeighbourCount1(int i,int j,int[][]board){
//        int tag=;
        int count=0;
        int rows=board.length;
        int cols=board[0].length;
        // left
        if(j-1>=0 && j-1<cols){
            if(board[i][j-1]%2==1) count++;
        }

        // right
        if(j+1>=0 && j+1<cols){
            if(board[i][j+1]%2==1) count++;
        }

        // up
        if(i-1>=0 && i-1<rows){
            if(board[i-1][j]%2==1)count++;
        }
        // down
        if(i+1>=0 && i+1<rows){
            if(board[i+1][j]%2==1)count++;
        }
        // up-left
        if(i-1>=0 && j-1>=0 && i-1<rows && j-1<cols){
            if(board[i-1][j-1]%2==1)count++;
        }
        // up-right
        if(i-1>=0 && j+1>=0 && i-1<rows && j+1<cols){
            if(board[i-1][j+1]%2==1)count++;
        }
        // down-left
        if(i+1>=0 && j-1>=0 && i+1<rows && j-1<cols){
            if(board[i+1][j-1]%2==1)count++;
        }
        // down-right
        if(i+1>=0 && j+1>=0 && i+1<rows && j+1<cols){
            if(board[i+1][j+1]%2==1)count++;
        }

        return count;
    }





}
