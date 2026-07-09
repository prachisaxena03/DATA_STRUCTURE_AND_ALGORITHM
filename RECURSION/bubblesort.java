package RECURSION;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 1, 9, 3};
       selectionsort(arr,1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
//    static void bubble(int[] arr,int i,int j){
//        if(i==0){
//            return;
//        }
//        if(i>j){
//            if(arr[j]>arr[j+1]){
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//            bubble(arr,i,j+1);
//        }else{
//            bubble(arr,i-1,0);
//
//        }
//    }
//    static void selection(int[] arr,int r, int c, int m){
//        if(r==0){
//            return;
//        }
//        if(c<r){
//            if(arr[c]>arr[m]){
//                selection(arr,r,c+1,c);
//            }else{
//                selection(arr,r,c+1,m);
//            }
//        }else{
//            int temp=arr[m];
//            arr[m]=arr[r-1];
//            arr[r-1]=temp;
//            selection(arr,r-1,0,0);
//        }
//    }
//        public static int[] bubbleSort(int[] nums) {
//            for(int i=0;i<nums.length;i++){
//                bubbles(nums,0,nums.length-i-1);
//            }
//            return nums;
//
//        }
//        static void bubbles(int[] arr,int start,int end) {
//            if (start >= end) {
//                return;
//            }
//            if (arr[start] < arr[start + 1]) {
//                int temp = arr[start];
//                arr[start] = arr[start + 1];
//                arr[start + 1] = temp;
//            }
//
//            bubbles(arr, start + 1, end);
//        }

    static void selectionsort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int key=arr[start];
        int j=start-1;
        while(j>=0&&arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
        selectionsort(arr,start+1,end);
    }
    }

