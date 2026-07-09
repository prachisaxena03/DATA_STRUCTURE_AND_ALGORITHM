package Pattern;

public class Simple {
    public static void main(String[] args) {
        patterns(6);
    }
//    public static void patterns(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=0;j<=n-i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void patterns(int n){
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//    static void patterns(int n){
//        for(int i=1;i<2*n;i++){
//           int total=i>n?2*n-i:i;
//           for(int j=1;j<=total;j++){
//               System.out.print("* ");
//           }
//            System.out.println();
//        }
////    }
//    static void patterns(int n){
//        for(int i=1;i<2*n;i++){
//            int total=i>n?2*n-i:i;
//            int space=n-total;
//            for(int s=1;s<=space;s++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=total;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
    static void patterns(int n){
    for(int i=1;i<=n;i++){
        for(int s=0;s<n-i;s++){
            System.out.print("  ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j+" ");
        }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }

}
