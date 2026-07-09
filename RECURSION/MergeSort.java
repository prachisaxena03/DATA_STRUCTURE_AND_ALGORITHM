package RECURSION;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 9, 10};
        int[] ans = mergesort(arr);
        System.out.println("Sorted array is:"+Arrays.toString(ans));
    }

    static int[] mergesort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length/ 2;
        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] rigth = mergesort(Arrays.copyOfRange(arr, mid , arr.length));
        return merge(left, rigth);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[first.length + second.length];
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] =second[j] ;
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

