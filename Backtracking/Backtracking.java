package Backtracking;

import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        int[][] matrix=new int[maze.length][maze[0].length];
        allpaths("",maze,0,0,matrix,1);
    }
    static void paths(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1){
            paths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            paths(p+'R',maze,r,c+1);
        }
        if(c>0){
            paths(p+'L',maze,r,c-1);
        }
        if(r>0){
            paths(p+'U',maze,r-1,c);
        }
        maze[r][c]=true;
    }
    static void allpaths(String p,boolean[][] maze,int r,int c,int[][] matrix,int step){
        if(r==maze.length-1&&c==maze[0].length-1){
            matrix[r][c]=step;
            for(int[] arr:matrix){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        matrix[r][c]=step;
        if(r<maze.length-1){
            allpaths(p+'D',maze,r+1,c,matrix,step+1);
        }
        if(c<maze[0].length-1){
            allpaths(p+'R',maze,r,c+1,matrix,step+1);
        }
        if(c>0){
            allpaths(p+'L',maze,r,c-1,matrix,step+1);
        }
        if(r>0){
            allpaths(p+'U',maze,r-1,c,matrix,step+1);
        }
        maze[r][c]=true;
        matrix[r][c]=0;
    }
}
