package RECURSION;

public class sortedArray {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,6,5};
        System.out.println(arr(arr,0));
    }
    static boolean arr(int[] num,int index){
        if( index==num.length-1){
            return true;
        }
        return num[index]<num[index+1] && arr(num,index+1);
    }
}
