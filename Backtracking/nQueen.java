package Backtracking;

public class nQueen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queen(board,0));

    }
    static int queen(boolean[][] borad,int row){
        if(row==borad.length){
            display(borad);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<borad.length;col++){
            if (issafe(borad, row, col)) {
                borad[row][col]=true;
                count +=queen(borad,row+1);
                borad[row][col]=false;

            }
        }
        return count;
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board){
            for(boolean element:arr){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
    static boolean issafe(boolean[][] board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]){
              return false;
            }
        }
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }

        }
        int maxrigth=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxrigth;i++){
            if(board[row-i][col+i]){
                return false;
            }

        }
        return true;
    }
}
