package Sorting;
public class Linear_search {
    public static void main(String[] args) {
        int[] arr = {5,2,1,4,3};
        int target = 1;
        int result = Linear(arr, target);
        System.out.println("element is present at the index:"+result);
    }

    static int Linear(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        return -1;
    }
}

