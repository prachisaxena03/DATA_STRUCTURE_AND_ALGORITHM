package Array;

import java.util.Arrays;
public class MaxmimumValue {
    public static void main(String[] args) {
        int[] arr={8,6,4,5,2,7,1,0};
        System.out.println(Arrays.toString(arr));
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxidex=max(arr,0,last);
            swap(arr,maxidex,last);
        }
    }
    static int max(int[] arr,int start,int last){
        int max=start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
