package Array;


import java.util.Arrays;

public class Reverse_array {
    public static void main(String[] args) {
        int[] arr = {59, 52, 78, 14, 17, 63};

        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

//        static void swap(int[] arr,int index1,int index2){
//            int temp=arr[index1];
//            arr[index1]=arr[index2];
//            arr[index2]=temp;
//
//
//    }
//}
