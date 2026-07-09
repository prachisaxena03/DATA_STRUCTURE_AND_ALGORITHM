package RECURSION;

import java.util.ArrayList;

public class skipping_letters {
    public static void main(String[] args) {
//        System.out.println(lis("","abc"));
        subseqascii("","ab");
    }
//    static void skip(String p,String up){
//        if (up.isEmpty())
//        {
//            System.out.println(p);
//            return;
//        }
//        char ch=up.charAt(0);
//        if(ch=='a'){
//            skip(p,up.substring(1));
//        }else{
//            skip(p+ch,up.substring(1));
//        }
//    }
//static String skip(String up){
//    if (up.isEmpty())
//    {
//        return"";
//    }
//    char ch=up.charAt(0);
//    if(ch=='a'){
//        return skip(up.substring(1));
//    }else{
//        return ch+skip(up.substring(1));
//    }
//}
static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p + ch,up.substring(1));
        subseq(p,up.substring(1));

}
static ArrayList<String> lis(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> rigth=lis(p,up.substring(1));
        ArrayList<String> left=lis(p+ch,up.substring(1));
        left.addAll(rigth);
        return left;
}
static void subseqascii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseqascii(p+ch,up.substring(1));
    subseqascii(p,up.substring(1));
    subseqascii(p+(ch+0),up.substring(1));
}
}
