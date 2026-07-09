package RECURSION;

public class zerosinnumber {
    public static void main(String[] args) {
        System.out.println(sum(10300000));
    }

    //    static int sum(int n){
//        int count =0;
//        while(n>0){
//            int digit=n%10;
//            if(digit==0){
//                count++;
//            }
//            n=n/10;
//        }
//        return count;
//    }
    static int sum(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c+1);
        }
        return helper(n/10, c);

    }
}

