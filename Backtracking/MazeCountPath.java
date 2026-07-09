package Backtracking;

import java.util.ArrayList;

public class MazeCountPath {
    public static void main(String[] args) {
//        System.out.println(count(4,3));
//        System.out.println(dia("",3,3));
        boolean[][] maze={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        System.out.println(obstacle("",maze,0,0));
    }
//    static int count(int r,int c){
//        if(r==1||c==1){
//            return 1;
//        }
//        int left=count(r,c-1);
//        int rigth=count(r-1,c);
//        return left+rigth;
//    }
//    static void path(String p,int r,int c){
//        if(r==1&&c==1){
//            System.out.println(p);
//            return;
//        }
//        if(r>1){
//            path(p+'D',r-1,c);
//        }
//        if(c>1){
//            path(p+'R',r,c-1);
//        }
//    }
//    static ArrayList<String> paths(String p,int r,int c){
//        if(r==1&&c==1){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> list=new ArrayList<>();
//        if(r>1){
//           list.addAll(paths(p+'D',r-1,c));
//        }
//        if(c>1){
//            list.addAll(paths(p+'R',r,c-1));
//        }
//        return list;
//    }
//    static ArrayList<String> dia(String p,int r,int c){
//        if(r==1&&c==1){
//            ArrayList<String> list=new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> list=new ArrayList<>();
//
//        if(r>1){
//            list.addAll(dia(p+'H',r-1,c));
//        }
//        if(c>1){
//            list.addAll(dia(p+'V',r,c-1));
//        }
//        if(r>1&&c>1){
//            list.addAll(dia(p+'D',r-1,c-1));
//        }
//        return list;
//    }
    static ArrayList<String> obstacle(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(maze[r][c]==false){
            return list;
        }

        if(r<maze.length-1){
            list.addAll(obstacle(p+'D',maze,r+1,c));
        }
        if(c<maze[0].length-1){
            list.addAll(obstacle(p+'R',maze,r,c+1));
        }
        return list;
    }
}
