package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>( 10);
//        list.add(26);
//        list.add(35);
//        list.add(3585);
//        list.add(75);
//        list.add(125);
//        System.out.println(list.contains(35));
//        list.set(0,99);
//        list.remove(2);
        System.out.println(list);
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for (int i=0;i<5;i++){
            System.out.print(list.get(i));
        }



    }
}
