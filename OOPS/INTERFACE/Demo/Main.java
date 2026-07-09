package OOPS.INTERFACE.Demo;

public class Main implements A,B {
    @Override
    public void funn() {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Main main =new Main();
        main.fun();
        A.run();
    }
}
