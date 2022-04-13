package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n=3;
        int [][]matrix=generateMatrix(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] generateMatrix(int n) {
        int [][]matrix=new int[n][n];
        int number=1;
        int direction=0; // 0=right 1=down 2=left 3=right
        int left=0,right=n-1,top=0,bottom=n-1;
        while(left<=right && top<=bottom){
            if(direction % 4 == 0){
                for(int i=left;i<=right;i++){
                    matrix[top][i]=number;
                    number++;
                }
                top++;
            }
            else if(direction % 4 == 1){
                for(int i=top;i<=bottom;i++){
                    matrix[i][right]=number;
                    number++;
                }
                right--;
            }
            else if(direction % 4 == 2){
                for(int i=right;i>=left;i--){
                    matrix[bottom][i]=number;
                    number++;
                }
                bottom--;
            }
            else {
                for(int i=bottom;i>=top;i--){
                    matrix[i][left]=number;
                    number++;
                }
                left++;
            }
            direction++;
        }
        return matrix;

    }
}
