package RECURSION;
import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
          int[] arr={1,5,6,8,2,5};
        findIndex(arr,5,0);
        System.out.println(list);
    }
//    static int findIndex(int[] arr,int target,int index){
//        if(index==arr.length){
//            return -1;
//        }
//        if(target==arr[index]){
//                return index;
//        }
//        return findIndex(arr,target,index+1);
//
//    }
    static ArrayList<Integer> list=new ArrayList<>();
    static void findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(target==arr[index]){
                list.add(index);
        }
        findIndex(arr,target,index+1);

    }
}
