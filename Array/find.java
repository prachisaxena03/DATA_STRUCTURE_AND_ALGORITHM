package Array;


import java.util.Scanner;

public class find {
    public static void main(String[] args) {
        Scanner nc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=nc.nextInt();
        if(n%2==0){
            if(n<=5&&n>=2){
                System.out.println("not weird");
            }
            else if(n<=20&&n>=6){
                System.out.println("weird");
            }
            else{
                System.out.println("not weird");
            }
        }
        else{
            System.out.println("weird");
        }
    }
}
