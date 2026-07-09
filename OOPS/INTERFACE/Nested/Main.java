package OOPS.INTERFACE.Nested;

public class Main {
    public interface A{
        void fun();
    }
}
 class World implements Main.A{
     @Override
     public void fun() {
         System.out.println("hi");
     }
 }
