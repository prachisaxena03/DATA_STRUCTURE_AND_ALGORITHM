package lambda_Expression;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arr.add(i*3);
        }
        arr.forEach((item)->{
            System.out.print(item+" ");
        });
        operation sum=(a,b)-> a + b;
        operation pro=(int a,int b)->a*b;
        operation sub=(int a,int b)->a-b;
    }

}
interface operation{
    int operation(int a,int b);
}
