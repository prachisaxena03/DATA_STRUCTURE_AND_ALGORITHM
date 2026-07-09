package OOPS.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        try{
            divide(a,b);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("this will always execute");
        }


    }
    static int divide (int a,int b){
        return a/b;
    }
}
