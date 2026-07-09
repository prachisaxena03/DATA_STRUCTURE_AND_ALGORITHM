//package GENERICS;
//
//import java.util.Arrays;
//
//public class CustomizedArray <T>{
//    private int size=0;
//    private Object[] data;
//    private int DEFAULT_SIZE=10;
//    public CustomizedArray(){
//        this.data=new Object[DEFAULT_SIZE];
//    }
//    public void add(T num){
//        if(isFull()){
//            resize();
//        }
//        data[size++]=num;
//    }
//    private boolean isFull(){
//        return data.length==size;
//    }
//    private void resize(){
//        T[] temp=new Object[data.length*2];
//        for(int i=0;i<data.length;i++){
//            temp[i]=data[i];
//        }
//        data=temp;
//    }
//    public T remove(){
//        T removed=(T)(data[--size]);
//        return removed;
//    }
//    public T get(int index){
//        return (T)(data[index]);
//    }
//    public int size(){
//        return size;
//    }
//    public void set(int index,int value){
//        data[index]=value;
//    }
//    public String toString(){
//        return "Customized Arraylist"+"{"+"data="+ Arrays.toString(data)+"size="+size+"}";
//    }
//
//}
//class Main{
//    public static void main(String[] args) {
//        CustomizedArray arr=new CustomizedArray();
//        arr.add(5);
//        arr.add(6);
//        arr.get(1);
//        arr.set(1,9);
//        arr.remove();
//        System.out.println(arr.toString());
//    }
//}
