package pakage;



public class staticExamole {
    static int  a=5;
    static int b;
    static{
        System.out.println("im in the static block");
        b=a*9;
    }
    static class Test{
        int c=5;
    }

    public static void main(String[] args) {
        Test d=new Test();
        


    }

}
