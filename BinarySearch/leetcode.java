package BinarySearch;

public class leetcode {

//    public static void main(String[] args) {
//        int[] arr={25,56,140,582,697,720,1234,2134,5236,89654,258963,456987,58963};
//        int target=89654;
//        System.out.println(ans(arr,target));
//
//    }
//    public static  int ans(int[] arr,int target){
//        int start=0;
//        int end=1;
//        while(target>arr[end]){
//            int temp=end+1;
//            end=end+(end-start+1);
//            start=temp;
//        }
//        return search(arr,target,start,end);
//    }
//    public static int search(int[] arr,int target,int start,int end){
//        while(start<=end){
//            int mid=start+(end-start)/2;
//            if(target<arr[mid]){
//                end=mid-1;
//            }
//            else if(target>arr[mid]){
//                start=mid+1;
//            }
//            else{
//                return mid;
//            }
//        }

    public int fruitsintobasket(int[] fruits,int[] basket){
        int unplaced=0;
        boolean[] used=new boolean[basket.length];
        for(int fruit=0;fruit<fruits.length;fruit++){
            boolean placed=false;
            for(int j=0;j<basket.length;j++){
                if(fruit<=basket[j]&&!used[j]){
                    placed=true;
                    used[j]=true;
                    break;
                }
            }
            if(placed){
                unplaced++;
            }
        }
        return unplaced;
    }


}
