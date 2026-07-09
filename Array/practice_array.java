package Array;

import java.util.Scanner;
public class practice_array {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=in.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        reverse(arr);
        for(int num:arr) {
            System.out.print(num + " ");
        }
    }
    static void reverse(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            end--;
            start++;
        }
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
