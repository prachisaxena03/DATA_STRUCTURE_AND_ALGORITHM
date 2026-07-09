package BinarySearch;
import java.util.Arrays;

public class ceiling_number {


    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 10, 12, 23};
        int target = 7;
        System.out.println(Arrays.toString(arr));
        int result = binarySearch(arr, target);
        System.out.println(result);

    }

}