package BinarySearch;

public class Concept {
    public static void main(String[] args) {
        int[] arr = {-12, -9, 2, 5, 9, 47, 59, 102, 230};
        int target = 230;
        int result=binary(arr,target);
        System.out.println(result);


    }
    static int binary(int[] arr,int target){
        int start=0;
        int end=arr.length;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }

        else if(target<arr[mid]){
            end=mid-1;
            }
            else{
            return mid;
            }

        }
        return 0;
    }

}

