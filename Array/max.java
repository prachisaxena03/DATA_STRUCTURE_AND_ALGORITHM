package Array;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr={6,18,9,78,90};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static int max(int[]arr){
        if(arr.length==0){
            return -1;
        }
     int maxVal=arr[0];
     for( int i=1;i<arr.length;i++){
         if(maxVal<arr[i]){
             maxVal=arr[i];
         }
     }
     return maxVal;
    }
}
