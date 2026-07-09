package Array;

import java.util.*;

public class inputarr {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] array= new int[5];
    for (int i=0;i <array.length;i++)

    {
        array[i] = sc.nextInt();
    }
//    for(int i=0;i<array.length;i++){
//        System.out.print(array[i]+" ");}
//    for(int num:array){
//        System.out.print(num+" n ");//this is the method for each element in array print
//
//    }
    System.out.print(Arrays.toString(array));
    String[] str=new String[6];
    for(int i=0;i<str.length;i++){
        str[i]=sc.next();
    }
        System.out.println(Arrays.toString(str));


    }
}
