package Maths;

public class gcd_lcm {
    public static void main(String[] args) {
//        System.out.println(lcm(69,18));
        fun(5);

    }
//    static int gcd(int a,int b){
//        if(a==0){
//            return b;
//        }
//        return gcd(b%a,a);
//    }
//    static int lcm(int a,int b){
//        return a*b/gcd(a,b);
//    }
    static int print(int n){
        if(n>0){
            System.out.print(n);
        }
        return print(n-1);
    }
    static void prints(int n){
        if(n==0){
            return ;
        }
        prints(n-1);
        System.out.println(n);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
        System.out.println(n);
    }

}
