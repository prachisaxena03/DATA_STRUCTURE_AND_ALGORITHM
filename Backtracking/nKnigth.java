package Backtracking;




public class nKnigth {
    public static void main(String[] args) {
        int n=4;
       boolean[][] board=new boolean[n][n];
       knigth(board,0,0,4);
    }
    static void knigth(boolean[][] board,int row,int col,int knigth){
        if(knigth==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1&&col==board.length){
            return;
        }
        if(col==board.length){
            knigth(board,row+1,0,knigth);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knigth(board,row,col+1,knigth-1);
            board[row][col]=false;
        }
        knigth(board,row,col+1,knigth);
    }
    static void display(boolean[][] board){
        for(boolean[] arr:board) {
            for (boolean element : arr) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
    static boolean isSafe(boolean[][] board,int row,int col){
      if(valid(board,row-2,col-1)){
          if(board[row-2][col-1]){
              return false;
          }
      }
        if(valid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(valid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(valid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        return true;
    }
    static boolean valid(boolean[][] board,int row,int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length){
            return true;
        }
        return false;
    }
}

