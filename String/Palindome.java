package String;
import java.util.Locale;
public class Palindome {
    public static void main(String[] args) {
        String str = "hi world";
        System.out.println(vowel(str));
    }

    //    public static boolean pal(String str){
//        str=str.toLowerCase();
//        for(int i=0;i<str.length()/2;i++){
//            int start=str.charAt(i);
//            int end=str.charAt(str.length()-1-i);
//            if(start!=end){
//                return false;
//            }
//        }
//        return true;
//    }
    public static int[] vowel(String str) {
        int vowel = 0;
        int constant = 0;

        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch!=' ') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    constant++;
                }
            }

        }
        return new int[] {vowel,constant} ;
    }
}
