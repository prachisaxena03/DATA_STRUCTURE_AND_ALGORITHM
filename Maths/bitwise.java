package Maths;

public class bitwise {
    public static void main(String[] args) {
//        System.out.println(check(126));
//        int[] arr={2,3,4,1,2,1,3,6,4};
//        System.out.println(findXOR(arr));
//        System.out.println(magicnumber(6));
        int[] arr={2,2,3,2,7,7,8,7,8,8};
        System.out.println(singlenumber(arr));

    }
//    static boolean check(int n){
//        return (1&n)==1?false:true;
//    }
    static int findXOR(int[] arr){
        int ans=0;
        for(int n:arr){
            ans^=n;
        }
        return ans;
    }
    static int magicnumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
    static int singlenumber(int[] nums){
        int ans=0;
        int sum=0;
        for (int n : nums){
        for(int i=0;i<127;i++){
                sum+=(n >> 1) & 1;
            }
        }
           sum%=3;
        if(sum!=0){
            return sum;
        }
        return -1;
    }
}
