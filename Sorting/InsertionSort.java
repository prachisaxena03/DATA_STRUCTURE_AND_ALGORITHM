package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={6,4,5,8,9,1,0};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1+i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}
