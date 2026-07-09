package RECURSION;

public class leetcode {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    public  static int numberOfSteps(int n){
        int step=0;
        while(n>0){
            if(n%2==0){
                n=n/2;
                step++;
            }else{
                n=n-1;
                step++;
            }
        }
        return step;
    }

}
