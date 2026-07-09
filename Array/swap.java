package Array;


import java.util.Arrays;

public class swap {
    public static void main(String[] args){
        int[] arr={1,5,7,8,6};
        swap(arr,1 ,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap( int[] arr,int index1,int index2){
        int tamp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=tamp;
    }
}
